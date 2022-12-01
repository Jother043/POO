package Ordenador_y_videojuego;

public class DiscoDuro {

    /*
    Estos son los atributos de la clase Disco duro.
     */
    private int nucleos;
    private float velocidad;
    private String marca;
    private String tipo;
    private static int capacidad;

    /**
     * Método constructor.
     * @param marca
     * @param tipo
     * @param capacidad
     */
    public DiscoDuro(String marca, String tipo, int capacidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    /**
     * En este método devolvemos la capacidad del disco duro, ya que no nos interesa que puedan obtenerlos desde los
     * atributos, ya que también podrían modificarlo y eso no es conveniente, para el programa, causando fallos de seguridad.
     * @return capacidad del disco duro para utilizarlo posteriormente en videojuego,
     * ya que está privado y no tendría visibilidad desde las otras clases.
     */
    public static int getCapacidad() {
        return capacidad;
    }

    /**
     * Metodo toString
     * @return devolvemos el String de los valores de los atributos de la clase.
     */
    @Override
    public String toString() {
        return "DiscoDuro{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
