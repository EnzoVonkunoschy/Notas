public class Oficina implements Destinatario {
    private String nombre;

    public Oficina() {
        nombre = "";
    }

    @Override

    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Oficina: " + nombre + "\n";
    }
}
