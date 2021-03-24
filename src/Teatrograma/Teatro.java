package Teatrograma;

import Auxiliar.IO;

/**
 * Clase Teatro: Permite representar el propio teatro
 */
public class Teatro {

    // Atributos

    /**
     * Define cada una de las obras que se representan en el teatro
     */
    private Obra obra;

    /**
     * Precio de la obra
     */
    private int precio;

    /**
     * Butacas de la sesión
     */
    private final Asiento[][] SESION;

    /**
     * Filas máximas del teatro
     */
    private final int MAX_FILAS = 3;

    /**
     * Butacas maximas por cada fila
     */
    private final int MAX_BUTACAS = 2;


    public Teatro() {
        this.SESION = new Asiento[MAX_FILAS][MAX_BUTACAS];
    }

    /**
     * Permite crear un objeto de la clase Teatro con 2 argumentos
     *
     * @param obra   objeto de la clase Obra que define la obra representada en el teatro
     * @param precio entero con el precio de la obra de teatro
     */
    public Teatro(Obra obra, int precio) {
        this.obra = obra;
        this.precio = precio;
        this.SESION = new Asiento[MAX_FILAS][MAX_BUTACAS];
    }

    /**
     * Permite crear un objeto de la clase Teatro con 3 argumentos
     *
     * @param obra objeto de la clase Obra que define la obra representada en el teatro
     */
    public Teatro(Obra obra) {
        this.obra = obra;
        this.precio = 0;
        this.SESION = new Asiento[MAX_FILAS][MAX_BUTACAS];
    }

    // Getters & Setters

    /**
     * Permite obtener la obra que se está representando en el teatro
     *
     * @return objeto de la clase Obra que muestra los datos de una determinada obra
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * Permite asignar una obra al teatro
     *
     * @param obra objeto de la clase Obra que muestra los datos de una determinada obra
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * Permite obtener el precio de una obra
     *
     * @return entero con la cantidad de dinero que cuesta una determinada obra
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Permite asignar el precio a una determinada obra
     *
     * @param precio entero con la cantidad de dinero que cuesta una determinada obra
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Permite obtener las butacas de una determinada obra
     *
     * @return objeto de la clase Asiento que muestra los datos de las butacas de la obra
     */
    public Asiento[][] getSESION() {
        return SESION;
    }


    // Método toString

    /**
     * Permite transformar los datos del teatro en una cadena de caracteres
     *
     * @return cadena de caracteres con los datos del teatro
     */
    @Override
    public String toString() {
        return "Obra: " + obra.getTitulo() + " | " +
                "Precio: " + precio + " €";
    }

    // Otros métodos

    /**
     * Permite averiguar si la butaca introducida está disponible o no
     *
     * @param fila   entero que representa el número de fila de la sala
     * @param numero entero que representa el número de butaca en cada una de las filas
     * @return boolean TRUE Si la butaca está disponible, FALSE si está ocupada
     */
    public boolean butacaDisponible(int fila, int numero) {
        return this.SESION[fila][numero] == null;
    }

    /**
     * Permite asignar un Asiento (butaca) a una determinada persona
     *
     * @param persona objeto de la clase Publico que almacena una persona
     * @param obra    objeto de la clase Obra que almacena la obra que se va a representar en el teatro
     * @return boolean devuelve TRUE si la butaca ha sido asignada, FALSE si no se ha podido asignar
     */
    public boolean asignarButaca(Publico persona, Obra obra) {
        /*
        Comprobamos que la persona cumple los requisitos de edad para entrar
         */
        if (this.puedeEntrar(persona, obra)) {
            /*
            Si el usuario puede pagar la entrada de la funcion
            */
            if (persona.pagarEntrada(this)) {
                /*
                Capturamos fila y num de butaca
                 */
                int fila = IO.enterInt("Introduce el nº de fila (1 - " + MAX_FILAS + "): ") - 1;
                int numero = IO.enterInt("Introduce el nº de butaca (1 - " + MAX_BUTACAS + "): ") - 1;

                /*
                Comprobamos que el num de fila y butaca se encuentren dentro de los límites
                 */
                if (fila >= MAX_FILAS || numero >= MAX_BUTACAS) {
                    IO.printText("Los datos introducidos no son correctos");
                } else {
                /*
                Comprobamos que la fila y el num de butaca están disponibles
                 */
                    if (this.butacaDisponible(fila, numero)) {
                        /*
                        Asignamos objeto de tipo Asiento al array bidimensional con la plantilla de butacas
                         */
                        this.SESION[fila][numero] = new Asiento(fila, numero, persona);

                        return true;
                    } else {
                        IO.printText("La butaca está ocupada \n");
                    }
                }
            } else {
                IO.printText("El usuario " + persona.getNombre() + " no tiene dinero suficiente.");
            }
        } else {
            IO.printText("La persona no cumple los requisitos de edad. \n");
        }

        return false;
    }


    /**
     * Permite averiguar si una persona puede asistir a una determinada función o no
     *
     * @param persona Objeto de la clase Publico: Persona que quiere asistir a una determinada función
     * @param obra    Objeto de la clase Obra: Obra que es representada en el teatro
     * @return boolean TRUE si la persona cumple los requisitos para asistir y FALSE si no los cumple
     */
    public boolean puedeEntrar(Publico persona, Obra obra) {
        /*
        Si la obra es para mayores de 18 y la persona es menor de edad no puede entrar
         */
        if (obra.getMayorEdad() && !persona.mayorEdad()) {
            return false;
        }

        /*
        Devolvemos TRUE si la persona cumple con todos los requisitos
         */
        return true;
    }
}
