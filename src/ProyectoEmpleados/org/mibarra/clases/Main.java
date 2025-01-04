package ProyectoEmpleados.org.mibarra.clases;


public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", "Perez", "123456789", "Calle Falsa 123", 50000.0, 1, 1000000.0);
        System.out.println(gerente.toString());
    }
}

