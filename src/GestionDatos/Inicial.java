package GestionDatos;

import Auxiliar.IO;
import Teatrograma.Asiento;
import Teatrograma.Obra;
import Teatrograma.Publico;
import Teatrograma.Teatro;

public class Inicial {
    private final int MAX_OBRAS = 5;
    private final Obra[] listaObras = new Obra[MAX_OBRAS];
    private int contadorObras = 0;

    private final int MAX_SALAS = 3;
    private final Teatro[] listaSalas = new Teatro[MAX_SALAS];
    private int contadorSalas = 0;

    private final int MAX_PERSONAS = 5;
    private final Publico[] listaUsuarios = new Publico[MAX_PERSONAS];
    private int contadorUsuarios;


    public Inicial() {

    }

    /**
     * Permite crear una obra con los datos introducidos por el usuario
     */
    public void crearObra() {
        Obra obra = new Obra();

        String titulo = IO.enterString("Introduce un título: ");
        int duracion = IO.enterInt("Introduce la duración (en minutos): ");
        String autor = IO.enterString("Introduce el autor: ");
        boolean mayorEdad = IO.enterBoolean("Esta obra es para mayores de edad? (Si / No): ");

        obra.setTitulo(titulo);
        obra.setDuracion(duracion);
        obra.setAutor(autor);
        obra.setMayorEdad(mayorEdad);

        listaObras[this.contadorObras] = obra;
        this.contadorObras++;
    }

    /**
     * Muestra un listado de las obras que se han dado de alta
     */
    public void consultarObras() {
        for (int i = 0; i < this.contadorObras; i++) {
            System.out.println((i + 1) + ". " + listaObras[i]);
        }
    }

    /**
     * Muestra la obra seleccionada
     * @param posicion entero con el índice del objeto Obra dentro del array
     * @return devuelve un objeto con la Obra seleccionada
     */
    public Obra seleccionarObra(int posicion) {
        return listaObras[posicion];
    }

    /**
     * Permite dar de alta una sala de teatro
     */
    public void crearSala() {
        Teatro sala = new Teatro();

        int posicion; // Almacena posicion de una Obra en su array
        int precio; // Almacena precio de la entrada

        // Mostramos el listado con las Obras creadas
        this.consultarObras();

        // Capturamos selección del usuario
        posicion = IO.enterInt("Selecciona una Obra: ") - 1;

        // Capturamos precio de la entrada
        precio = IO.enterInt("Introduce el precio de la entrada: ");

        // Creamos objeto
        sala.setObra(this.seleccionarObra(posicion));
        sala.setPrecio(precio);

        listaSalas[this.contadorSalas] = sala;
        this.contadorSalas++;
    }

    /**
     * Muestra un listado con el precio, las filas y las butacas disponibles para una determinada obra
     */
    public void consultarSala() {
        for (int i = 0; i < this.contadorSalas; i++) {
            System.out.println((i + 1) + ". " + listaSalas[i]);
        }
    }

    /**
     * Permite dar de alta usuarios
     */
    public void crearPersona() {
        Publico persona = new Publico();

        String nombre = IO.enterString("Introduce el nombre del usuario: ");
        int edad = IO.enterInt("Introduce la edad del usuario: ");
        int dinero = IO.enterInt("Introduce el dinero del usuario: ");

        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setDinero(dinero);

        listaUsuarios[this.contadorUsuarios] = persona;
        this.contadorUsuarios++;
    }

    /**
     * Muestra un listado de los usuarios creados
     */
    public void consultarUsuarios() {
        for (int i = 0; i < this.contadorUsuarios; i++) {
            System.out.println((i + 1) + ". " + listaUsuarios[i]);
        }
    }

    /**
     * Muestra el usuario seleccionado
     * @param posicion entero con el índice del objeto Publico dentro del array
     * @return devuelve un objeto con el usuario seleccionado
     */
    public Publico seleccionarUsuario(int posicion) {
        return listaUsuarios[posicion];
    }

    public void asignarUsuario() {
        Teatro sala = new Teatro();
        Publico persona;
        Asiento sesion = new Asiento();

        int posicion;
        this.consultarUsuarios();

        posicion = IO.enterInt("Selecciona una Persona: ") - 1;
        persona = this.seleccionarUsuario(posicion);

        sala.asignarButaca(sesion, persona, sala, );

    }
}
