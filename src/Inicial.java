import Auxiliar.IO;
import Teatrograma.Asiento;
import Teatrograma.Obra;
import Teatrograma.Publico;
import Teatrograma.Teatro;

public class Inicial {
    /*
     * Permite contabilizar el número de objetos creados de cada clase
     */
    private int contadorPersona;
    private int contadorObra;
    private int contadorAsiento;


    private final Asiento butaca = new Asiento();
    private Teatro sala = new Teatro();


    /*
     * Arrays que Permiten almacenar los objetos de cada tipo
     */
    Publico personas[] = new Publico[10];
    Obra obras[] = new Obra[5];
    //Asiento [] butaca = new Asiento[20];
    Teatro funcion[] = new Teatro[10];



    public static void main(String[] args) {
        Inicial programa = new Inicial();
        programa.inicio();
    }

    public void inicio() {
        sala.asignarButaca(butaca);
    }

    public void verButacas() {

    }


    public Obra crearObra() {
        String titulo = IO.enterString("Introduce un título: ");
        int duracion = IO.enterInt("Introduce la duración (en minutos): ");
        String autor = IO.enterString("Introduce el autor: ");
        boolean mayorEdad = IO.enterBoolean("Esta obra es para mayores de edad? (Si / No): ");

        Obra obra = new Obra(titulo, duracion, autor, mayorEdad);
        return obra;
    }
}
