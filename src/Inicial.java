import Auxiliar.IO;
import Auxiliar.Menu;
import GestionDatos.TeatroDB;
import GestionDatos.ObraDB;
import Teatrograma.Asiento;
import Teatrograma.Obra;
import Teatrograma.Publico;
import Teatrograma.Teatro;

public class Inicial {

    // Menu
    private final Menu MENU = new Menu();

    // Gestión de datos
    private final ObraDB OBRA = new ObraDB();
    private final TeatroDB FUNCION = new TeatroDB();


    public static void main(String[] args) {
        Inicial programa = new Inicial();
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
                    crearObra();
                    break;
                case 2:
                    // Alta función
                    crearFuncion();
                    break;
                case 3:
                    // Modificar
                    FUNCION.consultarFunciones();
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

    /**
     * Permite crear una obra con los datos introducidos por el usuario
     */
    public void crearObra() {
        Obra obra = new Obra();

        String titulo = IO.enterString("Introduce un título: ");
        int duracion = IO.enterInt("Introduce la duración (en minutos): ");
        String autor = IO.enterString("Introduce el autor: ");
        boolean mayorEdad = IO.enterBoolean("Esta obra es para mayores de edad? (Si / No): ");

        obra.setTitulo(titulo);
        obra.setDuracion(duracion);
        obra.setAutor(autor);
        obra.setMayorEdad(mayorEdad);

        OBRA.addObra(obra);
    }

    private void crearFuncion() {
        Teatro funcion = new Teatro();

        int posicion; // Almacena posicion de una Obra en su array
        int precio; // Almacena precio de la entrada

        // Mostramos el listado con las Obras creadas
        OBRA.consultarObras();

        // Capturamos selección del usuario
        posicion = IO.enterInt("Selecciona una Obra: ") - 1;

        // Capturamos precio de la entrada
        precio = IO.enterInt("Introduce el precio de la entrada: ");

        // Creamos objeto
        funcion.setObra(OBRA.seleccionarObra(posicion));
        funcion.setPrecio(precio);
        funcion.setSesion(funcion.getSesion());

        FUNCION.addFuncion(funcion);
    }
}
