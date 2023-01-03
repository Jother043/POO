package Gorila_Island;

public class Protagonista {
    static final int NUM_POSICIONES = 16;
    private String nombre;
    private GameObject[] inventario;

    public Protagonista(String nombre, GameObject[] inventario) {
        this.nombre = nombre;
        this.inventario = new GameObject[NUM_POSICIONES];
    }


}
