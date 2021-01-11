import Auxiliar.IO;
import Teatrograma.Asiento;
import Teatrograma.Obra;
import Teatrograma.Publico;

public class Inicial {
    /*
     * Permite contabilizar el número de objetos creados de cada clase
     */
    private int contadorPersona;
    private int contadorObra;
    private int contadorAsiento;


    /*
     * Arrays que Permiten almacenar los objetos de cada tipo
     */
    Publico personas[] = new Publico[10];
    Obra obras[] = new Obra[5];
    Asiento butaca[] = new Asiento[20];



    public static void main(String[] args) {
        Inicial programa = new Inicial();
        programa.inicio();
    }

    public void inicio() {

    }


    public Obra crearObra() {
        String titulo = IO.enterString("Introduce un título:");
        int duracion = IO.enterInt("Introduce la duración (en minutos): ");
        String autor = IO.enterString("Introduce el autor: ");
        String mayorEdad = IO.enterString("Esta obra es para mayores de edad?: ");

        Obra obra = new Obra(titulo, duracion, autor, mayorEdad);
        return obra;
    }
}
