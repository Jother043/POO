package Ordenador_y_videojuego;

public class DiscoDuro {

    public int nucleos;
    public float velocidad;
    String marca;
    String tipo;
    static int capacidad;

    public DiscoDuro(String marca, String tipo, int capacidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public static int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
