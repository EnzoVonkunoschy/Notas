public class Nota {
    private  Destinatario destinatario;
    private Empleado autor;
    private String texto;


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
    public String toString(){
        return " " +
                "Autor: " + autor +
                "\nDestinatario: " + destinatario +
                "\nTexto: " + texto;
    }
}
