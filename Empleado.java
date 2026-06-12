public class Empleado implements Destinatario {
    private String nombre;

    public Empleado() {
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
        return "Empleado: " + nombre + "\n";
    }
}