package ejercicio2.pruebas;

import ejercicio2.vehiculos.Moto;

// Main esta en OTRO paquete y NO es subclase de Vehiculo: es una clase no relacionada
public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha", 150);
        moto.mostrarInformacion(); // metodo public: si se puede usar

        // System.out.println(moto.tipo);
        // System.out.println(moto.marca);
        // ERROR DE COMPILACION (descomentar para verlo):
        // "tipo has protected access in ejercicio2.vehiculos.Vehiculo"
        // Un miembro protected solo es visible dentro de su paquete y desde sus
        // subclases. Main esta en otro paquete y no hereda de Vehiculo.

        // Forma correcta: usar los getters publicos
        System.out.println("Tipo (getter): " + moto.getTipo());
        System.out.println("Marca (getter): " + moto.getMarca());
    }
}
