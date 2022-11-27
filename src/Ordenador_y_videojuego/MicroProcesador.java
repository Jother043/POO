package Ordenador_y_videojuego;

public class MicroProcesador {
    //Creamos los atributos de Procesador.
    String marca;
    String modelo;
    int nucleos;
    float velocidad;
    String socket;

    public MicroProcesador(String marca, String modelo, int nucleos, float velocidad, String socket) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.velocidad = velocidad;
        this.socket = socket;
    }

    public int getNucleos() {
        return nucleos;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public String getSocket() {
        return socket;
    }


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
