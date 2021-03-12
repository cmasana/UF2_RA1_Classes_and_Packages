package Auxiliar;

/**
 * Clase Menu: Muestra los diferentes menús de la aplicación
 */
public class Menu {
    /**
     * Menú principal con sus correspondientes opciones
     */
    private final String[] MENUPRINCIPAL =
            {
                    "Registrar Obra",
                    "Registrar Sala",
                    "Registrar Persona",
                    "Asignar Butaca",
                    "Listas",
                    "Salir"
            };

    /**
     * Menú secundario para el apartado de listar teatro con sus correspondientes opciones
     */
    private final String[] MENUSECUNDARIO =
            {
                    "Listar sala de butacas",
                    "Listar espectadores",
                    "Atrás"
            };

    /**
     * Permite obtener el menú principal
     * @return array de tipo String con las opciones del menú
     */
    public String[] getMENUPRINCIPAL() {
        return MENUPRINCIPAL;
    }

    /**
     * Permite obtener el menú secundario
     * @return array de tipo String con las opciones del menú
     */
    public String[] getMENUSECUNDARIO() {
        return MENUSECUNDARIO;
    }
}
