package ExamenPooT4;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return edad == jugador.edad && numGoles == jugador.numGoles && Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, numGoles);
    }
}
