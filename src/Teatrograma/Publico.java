package Teatrograma;

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


    // Constructor vacío

    public Publico() {

    }

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
        this.nombre = "anonimo";
        this.edad = edad;
        this.dinero = dinero;
    }

    /**
     * Permite crear un objeto de la clase Publico con 1 argumento
     * @param dinero entero que define el dinero que tiene una persona
     */
    public Publico(int dinero) {
        this.nombre = "anonimo";
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
     * @return entero con la edad de una persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Permite asignar la edad a una persona
     * @param edad entero con la edad de una persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Permite obtener el dinero que tiene una persona
     * @return entero con el dinero que tiene una persona
     */
    public int getDinero() {
        return dinero;
    }

    /**
     * Permite asignar la cantidad de dinero que tiene una persona
     * @param dinero entero con la cantidad de dinero que tiene una persona
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
                "Dinero: " + dinero + " € \n";
    }

    // Otros métodos

    /**
     * Obtiene el dinero restante de una persona cuando paga el precio de una entrada
     * @param persona Objeto de la clase Publico: Representa una persona que paga la entrada de la función
     * @param funcion Objeto de la clase Teatro: Función (Obra) que se representa en el teatro
     * @return devuelve un entero con el dinero restante de una persona tras pagar el precio de la entrada
     */
    public int pagarEntrada(Publico persona, Teatro funcion) {
        int dineroRestante = persona.getDinero() - funcion.getPrecio();
        return dineroRestante;
    }

    /**
     * Permite conocer si una persona es mayor de edad
     * @param persona Objeto de la clase Publico: Persona que quiere acudir a una función
     * @return devuelve TRUE si la persona es mayor de edad y FALSE si no lo es
     */
    public boolean mayorEdad(Publico persona) {
        final int ADULTO = 18;
        return persona.getEdad() >= ADULTO;
    }

    /**
     * Permite saber si el dinero que tiene una persona es suficiente para pagar el precio de una entrada
     * @param persona Objeto de la clase Publico: Persona que quiere pagar una entrada
     * @param funcion Ojeto de la clase Teatro: Función (Obra) que se representa en el teatro y de la que obtenemos el precio de la entrada
     * @return devuelve TRUE si la persona tiene suficiente dinero para pagar la entrada, FALSE si no es suficiente
     */
    public boolean tieneDinero(Publico persona, Teatro funcion) {
        final int ENTRADA = funcion.getPrecio();
        return persona.getDinero() >= ENTRADA;
    }
}
