package ExamenPooT4;

public class Jugador {

    private String nombre;
    private int edad;
    private int numGoles;

    public Jugador(String nombre, int edad, int numGoles) {
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumGoles() {
        return numGoles;
    }

    /**
     * Método que añade goles al jugador
     */
    public void añadirGol() {
        numGoles += 1;
        System.out.println("El jugador " + nombre + " marca un gol. ");
    }

    public int numGolTotal() {
        return numGoles;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numGoles=" + numGoles +
                '}';
    }
}
