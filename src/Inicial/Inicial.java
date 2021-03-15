package Inicial;

import Auxiliar.*;
import Teatrograma.*;

/**
 * Clase Inicial: Contiene los objetos y métodos necesarios para la ejecución del programa
 */
public class Inicial {
    // Instancias de objetos
    private final Obra OBRA = new Obra();
    private final Teatro SALA = new Teatro();
    private final Asiento BUTACA = new Asiento();

    // Constante para mejor experiencia de usuario
    private final int UNO = 1;

    // Array que almacena personas
    private final int MAX_PERSONAS = 5;
    private Publico[] LISTAPERSONAS = new Publico[MAX_PERSONAS];
    private int contadorPersonas;


    public Inicial() {
        // Activar SOLO para pruebas
        OBRA.setTitulo("El Rey León, el musical");
        OBRA.setDuracion(285);
        OBRA.setAutor("Roger Allers & Irene Mecchi");
        OBRA.setMayorEdad(false);

        SALA.setObra(OBRA);
        SALA.setPrecio(23);
    }

    /**
     * Permite crear una obra con los datos introducidos por el usuario
     */
    public void crearObra() {
        String titulo = IO.enterString("Introduce un título: ");
        int duracion = IO.enterInt("Introduce la duración (en minutos): ");
        String autor = IO.enterString("Introduce el autor: ");
        boolean mayorEdad = IO.enterBoolean("Esta obra es para mayores de edad? (Si / No): ");

        OBRA.setTitulo(titulo);
        OBRA.setDuracion(duracion);
        OBRA.setAutor(autor);
        OBRA.setMayorEdad(mayorEdad);
    }

    /**
     * Muestra un listado de las obras que se han dado de alta
     */
    public void consultarObra() {
        IO.printText(OBRA.toString());
    }


    /**
     * Permite dar de alta una sala de teatro
     */
    public void crearSala() {
        // Capturamos precio de la entrada
        int precio = IO.enterInt("Introduce el precio de la entrada para la Obra: "  + OBRA.getTitulo());

        // Creamos objeto
        SALA.setObra(OBRA);
        SALA.setPrecio(precio);
    }

    /**
     * Muestra una obra y el precio que hemos asignado
     */
    public void consultarSala() {
        IO.printText(SALA.toString());
    }

    /**
     * Permite dar de alta usuarios
     */
    public void crearPersona() {
        /*
        Comprobamos si el array que almacena las personas está lleno
         */
        if (this.contadorPersonas < MAX_PERSONAS) {
            /*
            Capturamos datos de la persona
             */
            String nombre = IO.enterString("Introduce el nombre del usuario: ");
            int edad = IO.enterInt("Introduce la edad del usuario: ");
            int dinero = IO.enterInt("Introduce el dinero del usuario: ");

            /*
            Asignamos el objeto Publico con los datos de la persona al array de personas
             */
            LISTAPERSONAS[contadorPersonas] = new Publico(nombre, edad, dinero);

            /*
            Incrementamos el contador de personas
             */
            this.contadorPersonas++;
        } else {
            IO.printText("Se ha alcanzado el máximo de personas: " + MAX_PERSONAS);
        }
    }

    /**
     * Muestra un listado de los usuarios creados
     */
    public void consultarPersonas() {
        for (int i = 0; i < this.contadorPersonas; i++) {
            IO.printText((i + 1) + ". " + LISTAPERSONAS[i]);
        }
    }

    /**
     * Muestra el usuario seleccionado
     * @param posicion entero con el índice del objeto Publico dentro del array
     * @return devuelve un objeto con el usuario seleccionado
     */
    public Publico seleccionarPersona(int posicion) {
        return LISTAPERSONAS[posicion];
    }

    /**
     * Permite eliminar una persona del array de lista de personas
     * @param posicion entero con la posición de la persona en el array
     * @return devuelve un array de tipo Publico actualizado
     */
    public Publico[] eliminarPersona(int posicion) {
        LISTAPERSONAS[posicion] = null;
        this.contadorPersonas--;

        return LISTAPERSONAS;
    }

    /**
     * Permite asignar un usuario de la lista de usuarios a una determinada butaca
     */
    public void asignarUsuario() {
        boolean asignado;

        if (this.contadorPersonas != 0) {
            this.consultarPersonas(); // Listado de usuarios

            int posicion = IO.enterInt("Selecciona una Persona: ") - UNO;
            Publico persona = this.seleccionarPersona(posicion);

            asignado = SALA.asignarButaca(persona, SALA.getObra());

            if(asignado) {
                /*
                Eliminamos la persona del array de personas después de haber sido asignado a una butaca
                 */
                LISTAPERSONAS = this.eliminarPersona(posicion);
            }
        } else {
            IO.printText("No existe ningún usuario");
        }
    }

    /**
     * Muestra visualmente el patio de butacas en forma de tablero
     * Si la butaca está ocupada se muestra X, en caso contrario se muestra O
     */
    public void verButacas() {
        for (int fila = 0; fila < SALA.getSESION().length; fila++) {
            for (int numButaca = 0; numButaca < SALA.getSESION()[fila].length; numButaca++) {
                if (!BUTACA.estaOcupado(SALA.getSESION(), fila, numButaca)) {
                    IO.printTextNotLine("[ O ]");
                } else {
                    IO.printTextNotLine("[ X ]");
                }
            }
            IO.printText(" ");
        }
    }

    /**
     * Muestra los espectadores que han entrado a la obra
     */
    public void verEspectadores() {
        for (int fila = 0; fila < SALA.getSESION().length; fila++) {
            for (int numButaca = 0; numButaca < SALA.getSESION()[fila].length; numButaca++) {
                if (BUTACA.estaOcupado(SALA.getSESION(), fila, numButaca)){
                    IO.printText(SALA.getSESION()[fila][numButaca].getPersona().toString()
                            + " | Fila: " + (fila + UNO)
                            + " Butaca: " + (numButaca + UNO));
                }
            }
        }
    }

    /**
     * Muestra un menú con 2 opciones para listar información relevante del teatro
     */
    public void listarTeatro() {
        // Menú secundario
        final Menu MENU = new Menu();

        boolean salir = false;
        do {
            IO.printText("LISTAR TEATRO");
            // Print menu
            IO.printMenu(MENU.getMENUSECUNDARIO());
            int opcion = IO.enterInt("Escoge una opción: ");
            switch (opcion) {
                case 1:
                    // Ver sala de butacas de manera visual
                    this.verButacas();
                    break;
                case 2:
                    // Ver usuarios con sus correspondientes butacas
                    this.verEspectadores();
                    break;
                case 3:
                    // Salir
                    salir = true;
                    break;
                default:
                    IO.printText("Opción incorrecta \n");
                    break;
            }
        } while (!salir);
    }
}
