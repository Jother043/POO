package Ordenador_y_videojuego;

public class MicroProcesador {
    //Creamos los atributos de Procesador.
    String marca;
    String modelo;
    static int nucleos;
    static float velocidad;
    String socket;

    /**
     * Contructor del Micro Procesador.
     * @param marca
     * @param modelo
     * @param nucleos
     * @param velocidad
     * @param socket
     */
    public MicroProcesador(String marca, String modelo, int nucleos, float velocidad, String socket) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.velocidad = velocidad;
        this.socket = socket;
    }

    public static int getNucleos() {
        return nucleos;
    }

    public static float getVelocidad() {
        return velocidad;
    }

    public String getSocket() {
        return socket;
    }

    /**
     * Método que pinta en un String de todos los atributos.
     * @return String
     */

    @Override
    public String toString() {
        return "MicroProcesador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nucleos=" + nucleos +
                ", velocidad=" + velocidad +
                ", socket='" + socket + '\'' +
                '}';
    }
}
