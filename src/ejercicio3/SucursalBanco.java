package ejercicio3;

// Una subclase puede modificar el saldo sin ninguna validacion
public class SucursalBanco extends Banco {

    public SucursalBanco(double saldoInicial) {
        super(saldoInicial);
    }

    public void ajusteIndebido() {
        saldo = saldo + 1000000; // nadie controla este cambio
    }
}
