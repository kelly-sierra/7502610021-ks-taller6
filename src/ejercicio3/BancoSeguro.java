package ejercicio3;

// SOLUCION: saldo private y acceso solo mediante metodos que validan
public class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        this.saldo = Math.max(saldoInicial, 0);
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Deposito rechazado: el monto debe ser positivo.");
            return;
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0 || monto > saldo) {
            System.out.println("Retiro rechazado: monto invalido o saldo insuficiente.");
            return;
        }
        saldo -= monto;
    }
}
