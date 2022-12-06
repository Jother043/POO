package Ordenador_y_videojuego;

public class TarjetaGrafica {

    private String marca;
    private String modelo;
    private int nucleos;
    private float velocidad;
    private int memoria;

    /**
     * Método constructor de tarjeta gráfica.
     * @param marca
     * @param modelo
     * @param nucleos
     * @param velocidad
     * @param memoria
     */
    public TarjetaGrafica(String marca, String modelo, int nucleos, float velocidad, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.velocidad = velocidad;
        this.memoria = memoria;
    }
    // Métodos getter de Nucleo y Memoria.
    public int getNucleos() {
        return nucleos;
    }

    public int getMemoria() {
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
