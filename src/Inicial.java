import Auxiliar.IO;
import Auxiliar.Menu;
import GestionDatos.ObrasDatabase;
import Teatrograma.Asiento;
import Teatrograma.Obra;
import Teatrograma.Publico;
import Teatrograma.Teatro;

public class Inicial {
    /*
     * Permite contabilizar el número de objetos creados de cada clase
     */
    private int contadorPersona;
    private int contadorAsiento;


    private final Asiento butaca = new Asiento();
    private Teatro sala = new Teatro();

    private final Menu MENU = new Menu();

    // Gestión de datos
    private ObrasDatabase obrasDB = new ObrasDatabase();


    /*
     * Arrays que Permiten almacenar los objetos de cada tipo
     */
    Publico personas[] = new Publico[10];
    //Asiento [] butaca = new Asiento[20];
    Teatro funcion[] = new Teatro[10];



    public static void main(String[] args) {
        Inicial programa = new Inicial();
        programa.inicio();
    }

    public void inicio() {
        boolean salir = false;
        do {
            IO.printText("GESTIÓN DEL TEATRO");
            // Print menu
            IO.printMenu(MENU.getMENUPRINCIPAL());
            int opcion = IO.enterInt("Escoge una opción: ");
            switch (opcion) {
                case 1:
                    // Crear
                    obrasDB.altaObra();
                    break;
                case 2:
                    // Listar
                    obrasDB.consultarObras();
                    break;
                case 3:
                    // Modificar
                    break;
                case 4:
                    // Eliminar
                    break;
                case 5:
                    // Salir
                    salir = true;
                    break;
                default:
                    IO.printText("Opción incorrecta");
                    break;
            }
        } while (!salir);

        //sala.asignarButaca(butaca);
    }

    public void verButacas() {

    }
}
