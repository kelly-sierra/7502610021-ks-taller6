package ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PARTE 1: saldo protected (inseguro) ===");
        Banco banco = new Banco(500000);
        banco.mostrarSaldo();

        // Main esta en el mismo paquete, y protected tambien da acceso al paquete:
        banco.saldo = -999999; // se puede dejar un saldo negativo sin ninguna validacion
        banco.mostrarSaldo();

        SucursalBanco sucursal = new SucursalBanco(500000);
        sucursal.ajusteIndebido(); // la subclase altera el saldo sin control
        sucursal.mostrarSaldo();

        // Por que no es seguro:
        // 1. protected permite acceso a subclases y a todo el paquete.
        // 2. Cualquiera de ellas puede cambiar el saldo sin validar nada.
        // 3. Un dato critico no deberia poder modificarse directamente.

        System.out.println("\n=== PARTE 2: saldo private (solucion) ===");
        BancoSeguro seguro = new BancoSeguro(500000);
        seguro.depositar(200000);
        seguro.retirar(100000);
        seguro.retirar(9000000);  // rechazado: saldo insuficiente
        seguro.depositar(-50);    // rechazado: monto negativo
        System.out.println("Saldo actual: $" + seguro.getSaldo());

        // seguro.saldo = 100;  // ERROR DE COMPILACION: saldo has private access
    }
}
