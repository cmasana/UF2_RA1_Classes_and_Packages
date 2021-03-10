package Teatrograma;

import Auxiliar.IO;

import java.util.Arrays;

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
    private Asiento[][] sesion;

    /**
     * Filas máximas del teatro
     */
    private final int MAX_FILAS = 10;

    /**
     * Butacas maximas por cada fila
     */
    private final int MAX_BUTACAS = 5;


    public Teatro() {

    }

    /**
     * Permite crear un objeto de la clase Teatro con 2 argumentos
     * @param obra objeto de la clase Obra que define la obra representada en el teatro
     * @param precio entero con el precio de la obra de teatro
     */
    public Teatro(Obra obra, int precio) {
        this.obra = obra;
        this.precio = precio;
        this.sesion = new Asiento[MAX_FILAS][MAX_BUTACAS];
    }

    /**
     * Permite crear un objeto de la clase Teatro con 3 argumentos
     * @param obra objeto de la clase Obra que define la obra representada en el teatro
     */
    public Teatro(Obra obra) {
        this.obra = obra;
        this.precio = 0;
        this.sesion = new Asiento[MAX_FILAS][MAX_BUTACAS];
    }

    // Getters & Setters

    /**
     * Permite obtener la obra que se está representando en el teatro
     * @return objeto de la clase Obra que muestra los datos de una determinada obra
     */
    public Obra getObra() {
        return obra;
    }

    /**
     * Permite asignar una obra al teatro
     * @param obra objeto de la clase Obra que muestra los datos de una determinada obra
     */
    public void setObra(Obra obra) {
        this.obra = obra;
    }

    /**
     * Permite obtener el precio de una obra
     * @return entero con la cantidad de dinero que cuesta una determinada obra
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Permite asignar el precio a una determinada obra
     * @param precio entero con la cantidad de dinero que cuesta una determinada obra
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Permite obtener las butacas de una determinada obra
     * @return objeto de la clase Asiento que muestra los datos de las butacas de la obra
     */
    public Asiento[][] getSesion() {
        return sesion;
    }

    /**
     * Permite asignar las butacas a una determinada obra
     * @param sesion objeto de la clase Asiento que muestra los datos de las butacas de la obra
     */
    public void setSesion(Asiento[][] sesion) {
        this.sesion = sesion;
    }


    // Método toString

    /**
     * Permite transformar los datos del teatro en una cadena de caracteres
     * @return cadena de caracteres con los datos del teatro
     */
    @Override
    public String toString() {
        return "Obra: " + obra.getTitulo() + " | " +
                "Precio: " + precio + " € ";
    }

    // Otros métodos

    /**
     * Permite averiguar si la butaca introducida está disponible o no
     * @param fila entero que representa el número de fila de la sala
     * @param numero entero que representa el número de butaca en cada una de las filas
     * @return boolean TRUE Si la butaca está disponible, FALSE si está ocupada
     */
    public boolean butacaDisponible(int fila, int numero) {
        return sesion[fila][numero] == null;
    }


    /**
     * Permite asignar un Asiento (butaca) a una determinada persona
     */
    public void asignarButaca(Asiento sesion, Publico persona, Teatro sala, Obra obra) {
        int fila = IO.enterInt("Introduce el nº de fila: ");
        int numero = IO.enterInt("Introduce el nº de butaca: ");

        if (this.butacaDisponible(fila, numero)) {
            sesion.setFila(fila);
            sesion.setNumero(numero);
            if (this.puedeEntrar(sala, persona, obra)) {
                sesion.setPersona(persona);
            }
            else {
                IO.printText("La persona no cumple los requisitos para entrar");
            }
        }
        else {
            IO.printText("La butaca está ocupada");
        }
    }


    /**
     * Permite averiguar si una persona puede asistir a una determinada función o no
     * @param sala Objeto de la clase Teatro: Función (Obra) que se representa en el teatro
     * @param persona Objeto de la clase Publico: Persona que quiere asistir a una determinada función
     * @param obra Objeto de la clase Obra: Obra que es representada en el teatro
     * @return boolean TRUE si la persona cumple los requisitos para asistir y FALSE si no los cumple
     */
    public boolean puedeEntrar(Teatro sala, Publico persona, Obra obra) {
        if (obra.getMayorEdad() && !persona.mayorEdad(persona)) {
            return false;
        }
        else if (!persona.tieneDinero(persona, sala)) {
            return false;
        }
        return true;
    }
}
