public class Nota {
    private Destinatario destinatario;
    private Empleado autor;
    private String texto;

    public Nota() {
        texto = "";
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Empleado getAutor() {
        return autor;
    }

    public void setAutor(Empleado autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    @Override
    public String toString() {

        String nombreDestinatario = "";

        if(destinatario != null) {
            nombreDestinatario = destinatario.getNombre();
        }

        String nombreAutor = "";

        if(autor != null) {
            nombreAutor = autor.getNombre();
        }

        return "Nota\n" +
                "Autor: " + nombreAutor + "\n" +
                "Destinatario: " + nombreDestinatario + "\n" +
                "Texto: " + texto + "\n";
    }
}