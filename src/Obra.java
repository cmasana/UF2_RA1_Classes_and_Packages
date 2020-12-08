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
    private String mayorEdad;

    // Constructores sobrecargados

    /**
     * Permite crear un objeto de la clase Obra con 4 argumentos
     * @param titulo cadena de caracteres con el título de una obra
     * @param duracion entero que define la duración de una obra (en minutos)
     * @param autor cadena de caracteres con el nombre del autor de la obra
     * @param mayorEdad cadena de caracteres que define si una obra es para mayores de edad o no
     */
    public Obra(String titulo, int duracion, String autor, String mayorEdad) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = autor;
        this.mayorEdad = mayorEdad;
    }

    /**
     * Permite crear un objeto de la clase Obra con 3 argumentos
     * @param titulo cadena de caracteres con el título de una obra
     * @param duracion entero que define la duración de una obra (en minutos)
     * @param autor cadena de caracteres con el nombre del autor de la obra
     */
    public Obra(String titulo, int duracion, String autor) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = autor;
        this.mayorEdad = "Por determinar";
    }

    /**
     * Permite crear un objeto de la clase Obra con 2 argumentos
     * @param titulo cadena de caracteres con el título de una obra
     * @param duracion entero que define la duración de una obra (en minutos)
     */
    public Obra(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.autor = "Anónimo";
        this.mayorEdad = "Por determinar";
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
     * @return cadena de caracteres que indica si una obra es para mayores de edad o no
     */
    public String getMayorEdad() {
        return mayorEdad;
    }

    /**
     * Permite asignar una cadena de caracteres que indica si la obra es para mayores de edad o no
     * @param mayorEdad cadena de caracteres que indica si una obra es para mayores de edad o no
     */
    public void setMayorEdad(String mayorEdad) {
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
                "Mayores de Edad: " + mayorEdad;
    }
}
