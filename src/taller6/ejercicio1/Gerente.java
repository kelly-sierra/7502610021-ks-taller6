package taller6.ejercicio1;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        // nombre y salario son protected: la subclase los usa directamente
        System.out.println("Gerente: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
