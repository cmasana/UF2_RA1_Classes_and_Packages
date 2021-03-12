package Teatrograma;

/**
 * Clase Asiento: Representa las butacas que tiene el teatro
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
     * Permite crear un objeto de la clase Asiento con 3 argumentos
     * @param fila entero que representa la fila de una butaca
     * @param numero entero que representa la ubicación de una butaca
     * @param persona objeto de tipo Publico con los datos de una persona
     */
    public Asiento(int fila, int numero, Publico persona) {
        this.fila = fila;
        this.numero = numero;
        this.persona = persona;
    }

    /**
     * Permite crear un objeto de la clase Asiento con 2 argumentos
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
     * @return objeto de la clase Publico con los datos de una persona
     */
    public Publico getPersona() {
        return persona;
    }

    /**
     * Permite asignar los datos de una persona a una butaca
     * @param persona objeto de la clase Publico con los datos de una persona
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
     * Permite conocer si una butaca está ocupada o no
     * @param listaButacas array de tipo Asiento que almacena las butacas de la sala de teatro
     * @param fila entero que almacena la fila de butacas
     * @param numButaca entero que almacena el número de butaca de una determinada fila
     * @return devuelve TRUE si la butaca está ocupada y FALSE si no lo está
     */
    public boolean estaOcupado(Asiento[][] listaButacas, int fila, int numButaca) {
        // Devuelve TRUE si hay un objeto almacenado en una posición determinada
        return listaButacas[fila][numButaca] != null;
    }
}
