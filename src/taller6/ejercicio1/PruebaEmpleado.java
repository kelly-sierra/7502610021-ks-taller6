package taller6.ejercicio1;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Carlos Perez", 2500000);
        Gerente gerente = new Gerente("Laura Gomez", 6000000, "Ventas");

        empleado.mostrarInformacion();
        System.out.println();
        gerente.mostrarInformacion();
    }
}
