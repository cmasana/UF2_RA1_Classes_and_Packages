package Teatrograma;

/**
 * Clase Obra: Define cada una de las obras que se representan en el teatro actualmente
 */
public class Obra {
    // Atributos

    /**
     * Título de la obra
     */
    private String titulo;

    /**
     * Duración de la obra
     */
    private int duracion;

    /**
     * Autor de la obra
     */
    private String autor;

    /**
     * Permite identificar si la obra es para mayores de edad o no
     */
    private boolean mayorEdad;

    // Constructor vacío

    public Obra() {

    }

    // Constructores sobrecargados

    /**
     * Permite crear un objeto de la clase Obra con 4 argumentos
     * @param titulo cadena de caracteres con el título de una obra
     * @param duracion entero que define la duración de una obra (en minutos)
     * @param autor cadena de caracteres con el nombre del autor de la obra
     * @param mayorEdad cadena de caracteres que define si una obra es para mayores de edad o no
     */
    public Obra(String titulo, int duracion, String autor, boolean mayorEdad) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = autor;
        this.mayorEdad = mayorEdad;
    }

    /**
     * Permite crear un objeto de la clase Obra con 3 argumentos
     * @param titulo cadena de caracteres con el título de una obra
     * @param duracion entero que define la duración de una obra (en minutos)
     * @param mayorEdad boolean TRUE si la obra es para mayores de edad y FALSE si no lo es
     */
    public Obra(String titulo, int duracion, boolean mayorEdad) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = "Anónimo";
        this.mayorEdad = mayorEdad;
    }


    // Getters & Setters (Métodos de acceso)

    /**
     * Permite obtener el título de una obra
     * @return cadena de caracteres con el título de una obra
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Permite asignar el título de una obra
     * @param titulo cadena de caracteres con el título de una obra
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Permite obtener la duración (en minutos) de una obra
     * @return entero que representa la duración de una obra
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Permite asignar la duración (en minutos) de una obra
     * @param duracion entero que representa la duración de una obra
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Permite obtener el nombre del autor de una obra
     * @return cadena de caracteres con el nombre del autor de una obra
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Permite asignar el nombre del autor a una obra
     * @param autor cadena de caracteres con el nombre del autor de una obra
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Permite obtener una cadena de caracteres que nos indica si una obra es para mayores de edad o no
     * @return boolean devuelve TRUE si la obra es para adultos y FALSE si no lo es
     */
    public boolean getMayorEdad() {
        return mayorEdad;
    }

    /**
     * Permite asignar una cadena de caracteres que indica si la obra es para mayores de edad o no
     * @param mayorEdad boolean que indica si una obra es para mayores de edad o no
     */
    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    // Método toString

    /**
     * Permite transformar los datos de una obra en una cadena de caracteres
     * @return cadena de caracteres con los datos de una obra
     */
    @Override
    public String toString() {
        return  "Título: " + titulo + " | " +
                "Duración: " + duracion + " min | " +
                "Autor: " + autor + " | " +
                "Clasificación por edades: " +
                ((!mayorEdad) ? "Para todos los públicos" : "No recomendada para menores de 18 años");
    }
}
