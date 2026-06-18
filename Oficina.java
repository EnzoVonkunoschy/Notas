public class Oficina implements Destinatario {
   private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        if (nombre == null){
            return "";
        }
        return nombre;
    }
}
