import Auxiliar.IO;
import Auxiliar.Menu;
import GestionDatos.Inicial;
import Teatrograma.Teatro;

public class Main {

    // Menu
    private final Menu MENU = new Menu();

    // Gestión de datos
    private final Inicial INICIAL = new Inicial();


    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    private void inicio() {
        boolean salir = false;
        do {
            IO.printText("GESTIÓN DEL TEATRO");
            // Print menu
            IO.printMenu(MENU.getMENUPRINCIPAL());
            int opcion = IO.enterInt("Escoge una opción: ");
            switch (opcion) {
                case 1:
                    // Alta Obra
                    INICIAL.crearObra();
                    INICIAL.consultarObras();
                    break;
                case 2:
                    // Alta Sala
                    INICIAL.crearSala();
                    INICIAL.consultarSala();
                    break;
                case 3:
                    // Alta Persona
                    INICIAL.crearPersona();
                    INICIAL.consultarUsuarios();
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

    private void verButacas() {

    }

}
