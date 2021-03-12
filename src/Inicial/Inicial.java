package Inicial;

import Auxiliar.IO;
import Teatrograma.Asiento;
import Teatrograma.Obra;
import Teatrograma.Publico;
import Teatrograma.Teatro;

public class Inicial {
    // Instancias de objetos
    private final Obra OBRA = new Obra();
    private final Teatro SALA = new Teatro();
    private final Asiento BUTACA = new Asiento();

    // Array que almacena personas
    private final int MAX_PERSONAS = 5;
    private final Publico[] LISTAPERSONAS = new Publico[MAX_PERSONAS];
    private int contadorPersonas;


    public Inicial() {

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
     * Permite asignar un usuario de la lista de usuarios a una determinada butaca
     */
    public void asignarUsuario() {
        this.consultarPersonas(); // Listado de usuarios

        int posicion = IO.enterInt("Selecciona una Persona: ") - 1;
        Publico persona = this.seleccionarPersona(posicion);

        SALA.asignarButaca(BUTACA, persona, SALA.getObra());
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
}
