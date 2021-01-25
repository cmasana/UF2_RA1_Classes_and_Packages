package Teatrograma;

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

    // Constructor vacío

    public Teatro() {

    }

    // Constructores sobrecargados

    /**
     * Permite crear un objeto de la clase Teatro con 3 argumentos
     * @param obra objeto de la clase Obra que define la obra representada en el teatro
     * @param precio entero con el precio de la obra de teatro
     * @param sesion objeto de la clase Asiento que define las butacas que hay para la obra de teatro
     */
    public Teatro(Obra obra, int precio, Asiento[][] sesion) {
        this.obra = obra;
        this.precio = precio;
        this.sesion = sesion;
    }

    /**
     * Permite crear un objeto de la clase Teatro con 2 argumentos
     * @param obra objeto de la clase Obra que define la obra representada en el teatro
     * @param sesion objeto de la clase Asiento que define las butacas que hay para la obra de teatro
     */
    public Teatro(Obra obra, Asiento[][] sesion) {
        this.obra = obra;
        this.precio = 0;
        this.sesion = sesion;
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
        return "Teatrograma.Obra: " + obra + " | " +
                "Precio: " + precio + " € | " +
                "Sesión: " + Arrays.toString(sesion);
    }

    // Otros métodos

    /**
     * Permite averiguar si la butaca introducida está disponible o no
     * @param funcion Objeto de la clase Teatro: Función (Obra) que se representa en el teatro
     * @return boolean TRUE Si la butaca está disponible, FALSE si está ocupada
     */
    public boolean butacaDisponible(Teatro funcion) {
        return funcion.getSesion() == null;
    }


    /**
     * TO-DO - ME FALTA ALGO: DEVOLVER PERSONA O ASIENTO -> [X]
     * @param persona
     * @param sesion
     */
    public void asignarButaca(Publico persona, Teatro sesion) {
        if (this.butacaDisponible(sesion)) {

        }
    }


    /**
     * Permite averiguar si una persona puede asistir a una determinada función o no
     * @param funcion Objeto de la clase Teatro: Función (Obra) que se representa en el teatro
     * @param persona Objeto de la clase Publico: Persona que quiere asistir a una determinada función
     * @param obra Objeto de la clase Obra: Obra que es representada en el teatro
     * @return boolean TRUE si la persona cumple los requisitos para asistir y FALSE si no los cumple
     */
    public boolean puedeEntrar(Teatro funcion, Publico persona, Obra obra) {
        if (obra.getMayorEdad() && !persona.mayorEdad(persona)) {
            return false;
        }
        else if (!persona.tieneDinero(persona, funcion)) {
            return false;
        }
        return true;
    }
}
