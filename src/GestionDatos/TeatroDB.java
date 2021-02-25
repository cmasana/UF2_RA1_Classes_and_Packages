package GestionDatos;

import Teatrograma.Teatro;

public class TeatroDB {
    private final int MAX_FUNCIONES = 5; // Número máximo de Funciones (Representaciones) en el array
    private final Teatro[] listaFunciones; // Array que almacena Funciones
    private int contadorFunciones; // Contabiliza el número de funciones

    public TeatroDB() {
       listaFunciones  = new Teatro[MAX_FUNCIONES];
    }


    /**
     * Permite dar de alta una obra
     * @param funcion
     */
    public void addFuncion(Teatro funcion) {
        listaFunciones[this.contadorFunciones] = funcion;
        this.contadorFunciones++;
    }

    public void consultarFunciones() {
        for (int i = 0; i < contadorFunciones; i++) {
            System.out.println((i + 1) + ". " + listaFunciones[i]);
        }
    }


}
