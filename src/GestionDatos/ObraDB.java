package GestionDatos;

import Teatrograma.Obra;

/**
 * Clase ObraDB: Simula una bbdd, permite añadir, listar y obtener obras del array
 */
public class ObraDB {
    private final int MAX_OBRAS = 5; // Número máximo de Obras en el array
    private final Obra[] listaObras; // Array que almacena Obras
    private int contadorObras; // Contabiliza el número de obras

    // Constructor (Posee objetos ya creados para realizar todas las pruebas)
    public ObraDB() {
        listaObras = new Obra[MAX_OBRAS];
//        this.listaObras[0] = altaObra("El rey león", 185, "Roger Allers", false);
//        this.listaObras[1] = altaObra("La fiesta del chivo", 90, "Natalio Grueso", true);
    }

    /**
     * Permite dar de alta una obra
     * @param obra
     */
    public void addObra(Obra obra) {
        listaObras[this.contadorObras] = obra;
        this.contadorObras++;
    }

    /**
     * Muestra un listado de las obras que se han dado de alta
     */
    public void consultarObras() {
        for (int i = 0; i < this.contadorObras; i++) {
            System.out.println((i + 1) + ". " + listaObras[i]);
        }
    }

    /**
     * Muestra la obra seleccionada
     * @param posicion entero con el índice del objeto Obra dentro del array
     * @return devuelve un objeto con la Obra seleccionada
     */
    public Obra seleccionarObra(int posicion) {
        return listaObras[posicion];
    }

}
