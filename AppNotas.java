import javax.print.attribute.standard.Destination;

public class AppNotas {

    public static void main(String[] args) {
        System.out.println("Hola Notas");

        Oficina miOficina = new Oficina();
        System.out.print(miOficina);

        miOficina.setNombre("Personal");
        if (miOficina.getNombre().equals("Personal")) {
            System.out.print(miOficina);
        }

        Empleado miEmpleado = new Empleado();
        System.out.print(miEmpleado);

        miEmpleado.setNombre("Pablo");
        if (miEmpleado.getNombre().equals("Pablo")) {
            System.out.print(miEmpleado);
        }

        Destinatario oficinaReceptora = new Oficina();
        oficinaReceptora.setNombre("Archivo");

        Destinatario empleadoReceptor = new Empleado();
        empleadoReceptor.setNombre("Auditor");

        Nota miNota = new Nota();
        miNota.setDestinatario(oficinaReceptora);
        miNota.setAutor(miEmpleado);
        miNota.setTexto("¡Hola Equipo!");
        System.out.print(miNota);

        Nota otraNota = new Nota();
        otraNota.setDestinatario(empleadoReceptor);
        otraNota.setAutor(miEmpleado);
        otraNota.setTexto("¡Hola Señor Auditor!");
        System.out.print(otraNota);

    }
}