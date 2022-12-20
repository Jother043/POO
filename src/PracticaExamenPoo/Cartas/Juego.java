package PracticaExamenPoo.Cartas;

import java.util.Random;

public class Juego {

    private Carta[] baraja;

    public static void main(String[] args) {
        Juego j = new Juego();
        j.barajar();
        j.barajar();
        j.muestraBaraja();

    }

    public Juego(){
        baraja = new Carta[Carta.palos.length * Carta.NUM_MAX];
        int numCarta = 0;

        for(String palo : Carta.palos){
            for(int i = Carta.NUM_MIN; i <= Carta.NUM_MAX; i++){
                Carta c = new Carta(palo, i);
                baraja[numCarta++] = c;
            }
        }
    }
    public void barajar() {
        Carta[] auxiliar = new Carta[Carta.palos.length * Carta.NUM_MAX];
        Random r = new Random();
        for (int i = 0; i < this.baraja.length; i++) {
            int numAlea = r.nextInt(Carta.palos.length * Carta.NUM_MAX);

            while (auxiliar[numAlea] != null) {
                //numAlea = (numAlea + 1) % (Carta.palos.length * Carta.NUMERO_MAXIMO);
                numAlea++;
                if (numAlea == Carta.palos.length * Carta.NUM_MAX) {
                    numAlea = 0;
                }
            }

            auxiliar[numAlea] = baraja[i];

        }

        this.baraja = auxiliar;
    }

    public void muestraBaraja() {
        for (Carta c: this.baraja) {
            System.out.println(c);
        }
    }

}
