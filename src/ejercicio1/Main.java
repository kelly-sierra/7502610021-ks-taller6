package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Luis", 2500000);
        Gerente gerente = new Gerente("Marta", 6000000, "Sistemas");

        empleado.mostrarInformacion();
        System.out.println();
        gerente.mostrarInformacion();
    }
}
