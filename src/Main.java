import Auxiliar.IO;
import Auxiliar.Menu;
import Inicial.Inicial;

public class Main {

    // Menu
    private final Menu MENU = new Menu();

    // Gestión de datos
    private final Inicial INICIAL = new Inicial();


    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    /**
     * Muestra un menú con las opciones para gestionar nuestro Teatro
     */
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
                    INICIAL.consultarObra();
                    break;
                case 2:
                    // Alta Sala
                    INICIAL.crearSala();
                    INICIAL.consultarSala();
                    break;
                case 3:
                    // Alta Persona
                    INICIAL.crearPersona();
                    INICIAL.consultarPersonas();
                    break;
                case 4:
                    // Asignar butaca
                    INICIAL.asignarUsuario();
                    INICIAL.verButacas();
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
    }
}
