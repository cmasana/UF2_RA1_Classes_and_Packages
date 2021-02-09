package GestionDatos;

import Auxiliar.IO;
import Teatrograma.Obra;

public class ObrasDatabase {
    private final int MAX_OBRAS = 5;
    private Obra obras[] = new Obra[MAX_OBRAS];
    private int contadorObras;

    public ObrasDatabase() {
        obras[0] = new Obra("El rey león", 185, "Roger Allers", false);
        obras[1] = new Obra("La fiesta del chivo", 90, "Natalio Grueso", true);
        obras[2] = new Obra("Cats", 110, false);
        contadorObras = 3;
    }

    public Obra crearObra() {
        String titulo = IO.enterString("Introduce un título: ");
        int duracion = IO.enterInt("Introduce la duración (en minutos): ");
        String autor = IO.enterString("Introduce el autor: ");
        boolean mayorEdad = IO.enterBoolean("Esta obra es para mayores de edad? (Si / No): ");

        this.contadorObras++;
        Obra obra = new Obra(titulo, duracion, autor, mayorEdad);
        return obra;
    }

    public void altaObra() {
        obras[contadorObras] = crearObra();
    }

    public void consultarObras() {
        for (int i = 0; i < contadorObras; i++) {
            System.out.println(obras[i]);
        }
    }

}
