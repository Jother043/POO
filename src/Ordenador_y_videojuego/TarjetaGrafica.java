package Ordenador_y_videojuego;

public class TarjetaGrafica {

    private String marca;
    private String modelo;
    private static int nucleos;
    private float velocidad;
    private static int memoria;

    public TarjetaGrafica(String marca, String modelo, int nucleos, float velocidad, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.velocidad = velocidad;
        this.memoria = memoria;
    }

    public static int getNucleos() {
        return nucleos;
    }

    public static int getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return "TarjetaGrafica{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nucleos=" + nucleos +
                ", velocidad=" + velocidad +
                ", memoria=" + memoria +
                '}';
    }
}