package ejercicio3;

// MAL DISENIO: el saldo es protected, un dato critico
public class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}
