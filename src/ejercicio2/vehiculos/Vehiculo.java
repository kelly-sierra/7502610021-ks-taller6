package ejercicio2.vehiculos;

public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    // Solucion para clases no relacionadas: acceso mediante getters publicos
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }
}
