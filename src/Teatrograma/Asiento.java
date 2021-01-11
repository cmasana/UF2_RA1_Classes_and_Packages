package Teatrograma;

/**
 * Clase Teatrograma.Asiento: Representa las butacas que tiene el teatro
 */
public class Asiento {
    // Atributos

    /**
     * Fila de la zona de butacas
     */
    private int fila;

    /**
     * Número de la butaca
     */
    private int numero;

    /**
     * Persona que ocupa una butaca
     */
    private Publico persona;

    // Constructor vacío

    public Asiento() {

    }

    // Constructores sobrecargados

    /**
     * Permite crear un objeto de la clase Teatrograma.Asiento con 3 argumentos
     * @param fila entero que representa la fila de una butaca
     * @param numero entero que representa la ubicación de una butaca
     * @param persona objeto de tipo Teatrograma.Publico con los datos de una persona
     */
    public Asiento(int fila, int numero, Publico persona) {
        this.fila = fila;
        this.numero = numero;
        this.persona = persona;
    }

    /**
     * Permite crear un objeto de la clase Teatrograma.Asiento con 2 argumentos
     * @param fila entero que representa la fila de una butaca
     * @param numero entero que representa la ubicación de una butaca
     */
    public Asiento(int fila, int numero) {
        this.fila = fila;
        this.numero = numero;
        this.persona = null;
    }

    // Getters & Setters (Métodos de acceso)

    /**
     * Permite obtener la fila a la que pertenece una butaca
     * @return entero con el número de fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * Permite asignar una fila a la que pertenece una butaca
     * @param fila entero que representa una determinada fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * Permite obtener el número de asiento de una butaca
     * @return entero con el número de una butaca
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Permite asignar el número a una butaca
     * @param numero entero con el numero de una butaca
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Permite obtener los datos de la persona que ocupa una butaca
     * @return objeto de la clase Teatrograma.Publico con los datos de una persona
     */
    public Publico getPersona() {
        return persona;
    }

    /**
     * Permite asignar los datos de una persona a una butaca
     * @param persona objeto de la clase Teatrograma.Publico con los datos de una persona
     */
    public void setPersona(Publico persona) {
        this.persona = persona;
    }

    // Método toString

    /**
     * Permite transformar los datos de un asiento en una cadena de caracteres
     * @return  cadena de caracteres con los datos de un asiento
     */
    @Override
    public String toString() {
        return "Fila: " + fila + " | " +
                "Número: " + numero + " | " +
                "Persona: " + persona;
    }

    // Otros métodos

    /**
     * Permite conocer el estado de una butaca
     * @param butaca objeto de la clase Teatrograma.Asiento con los datos de una determinada butaca
     * @return devuelve TRUE si la butaca está ocupada y FALSE si no lo está
     */
    public boolean estaOcupado(Asiento butaca) {
        // Si la butaca tiene una persona asignada devuelve TRUE
        return butaca.getPersona() != null;
    }
}
