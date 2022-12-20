package PracticaExamenPoo.Cartas;

public class Carta {

    //Definimos las constantes en publicas, ya que si no no tendremos visibilidad desde la clase Juego.
    public static final String[] palos = {"oro", "copa", "espada", "basto"};
    public static final int NUM_MAX = 12;
    public static final int NUM_MIN = 1;

    private String palo;

    private int num;

    public Carta(String palo, int num) {
        if (paloEncontrado(palo)) {
            this.palo = palo;
        }
        if (num >= NUM_MIN && num <= NUM_MAX) {
            this.num = num;
        }
    }

    public String getPalo() {
        return palo;
    }

    public int getNum() {
        return num;
    }

    public static boolean paloEncontrado(String palo) {
        boolean encontrado = false;
        int i = 0;
        while (i < Carta.palos.length && !encontrado) {
            if (palo.equals(palos[i])) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", num=" + num +
                '}';
    }
}
