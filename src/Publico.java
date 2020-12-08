/**
 * Clase Publico: Representa cada uno de los clientes que tiene el teatro
 */
public class Publico {

    // Atributos

    /**
     * Nombre de una persona
     */
    private String nombre;

    /**
     * Edad de una persona
     */
    private int edad;

    /**
     * Dinero que tiene una persona
     */
    private int dinero;

    // Constructores sobrecargados

    /**
     * Permite crear un objeto de la clase Publico con 3 argumentos
     * @param nombre cadena de caracteres que define el nombre de una persona
     * @param edad entero que define la edad de una persona
     * @param dinero entero que define el dinero que tiene una persona
     */
    public Publico(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    /**
     * Permite crear un objeto de la clase Publico con 2 argumentos
     * @param edad entero que define el nombre de una persona
     * @param dinero entero que define el dinero que tiene una persona
     */
    public Publico(int edad, int dinero) {
        this.nombre = "anonim";
        this.edad = edad;
        this.dinero = dinero;
    }

    /**
     * Permite crear un objeto de la clase Publico con 1 argumento
     * @param dinero entero que define el dinero que tiene una persona
     */
    public Publico(int dinero) {
        this.nombre = "anonim";
        this.edad = 99;
        this.dinero = dinero;
    }

    // Getters & Setters (Métodos de acceso)

    /**
     * Permite obtener el nombre de una persona
     * @return cadena de caracteres con el nombre de una persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignar un nombre a una persona
     * @param nombre cadena de caracteres con el nombre de una persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite obtener la edad de una persona
     * @return número entero con la edad de una persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Permite asignar la edad a una persona
     * @param edad número entero con la edad de una persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Permite obtener el dinero que tiene una persona
     * @return número entero con el dinero que tiene una persona
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * Permite asignar la cantidad de dinero que tiene una persona
     * @param dinero número entero con la cantidad de dinero que tiene una persona
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    // Método toString

    /**
     * Permite transformar los datos de una persona en una cadena de caracteres
     * @return cadena de caracteres con los datos de una persona
     */
    @Override
    public String toString() {
        return  "Nombre: " + nombre + " | " +
                "Edad: " + edad + " | " +
                "Dinero: " + dinero + " €";
    }

    // Otros métodos

    /*
    TO-DO: Hay que implementar la lógica correctamente, es necesario pasar un parámetro que indique el precio de
    la entrada y restar del dinero total de una persona el importe de dicha entrada
     */
    public int pagarEntrada(Publico persona) {
        int dineroRestante = 0; // Está mal
        return dineroRestante;
    }

    /**
     * Permite conocer si una persona es mayor de edad
     * @param persona Objeto de la clase Publico
     * @return devuelve TRUE si la persona es mayor de edad y FALSE si no lo es
     */
    public boolean mayorEdad(Publico persona) {
        final int ADULTO = 18;
        return persona.getEdad() >= ADULTO;
    }

    /*
    TO-DO: Hace falta pasar por argumento el precio de una entrada e implementar la lógica correcta de la comprobación
     */
    public boolean tieneDinero(Publico persona) {
        final int ENTRADA = 10;
        return persona.getDinero() >= ENTRADA;
    }
}
