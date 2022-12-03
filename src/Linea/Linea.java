package Linea;

public class Linea {
    private int[][] puntoA;
    private int[][] puntoB;

    public Linea(int[][] puntoA, int[][] puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public int[][] getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(int[][] puntoA) {
        this.puntoA = puntoA;
    }

    public int[][] getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(int[][] puntoB) {
        this.puntoB = puntoB;
    }

}
