import java.util.Arrays;

public class Teatro {
    // Atributos

    private Obra obra;
    private int precio;
    private Asiento[][] sesion;

    // Constructores sobrecargados

    public Teatro(Obra obra, int precio, Asiento[][] sesion) {
        this.obra = obra;
        this.precio = precio;
        this.sesion = sesion;
    }

    public Teatro(Obra obra, Asiento[][] sesion) {
        this.obra = obra;
        this.precio = 0;
        this.sesion = sesion;
    }

    // Getters & Setters

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Asiento[][] getSesion() {
        return sesion;
    }

    public void setSesion(Asiento[][] sesion) {
        this.sesion = sesion;
    }

    // Método toString

    @Override
    public String toString() {
        return "Obra: " + obra + " | " +
                "Precio: " + precio + " € | " +
                "Sesión: " + Arrays.toString(sesion);
    }

    // Otros métodos

    public boolean butacaDisponible(Teatro teatro) {
        return teatro.getSesion() == null;
    }

    // TO-DO: Lidiar con bidimensionales xD

    /*public void asignarButaca() {

    }*/

    // TO-DO: Persona tiene dinero? Es mayor de edad en obra para > 18?
    public boolean puedeEntrar(Teatro teatro) {
        return false;
    }
}
