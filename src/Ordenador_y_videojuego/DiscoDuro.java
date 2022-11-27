package Ordenador_y_videojuego;

public class DiscoDuro {

    public int nucleos;
    public float velocidad;
    String marca;
    String tipo;
    int capacidad;

    public DiscoDuro(String marca, String tipo, int capacidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
