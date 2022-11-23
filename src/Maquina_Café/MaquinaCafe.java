package Maquina_Café;

public class MaquinaCafe {

    public static final int CAPSULAS_CAFE = 50;
    public static final int CAPSULAS_LECHE = 50;
    public static final int NUMERO_VASOS = 80;

    public static final double PRECIO_CAFE = 1;
    public static final double PRECIO_LECHE = 0.8;
    public static final double PRECIO_CAFE_LECHE = 1.5;
    public static final double MINIMO_MONEDERO = 10;

    public static final int OPCION_CAFE = 1;
    public static final int OPCION_LECHE = 2;
    public static final int OPCION_CAFE_LECHE = 3;
    public static final int OPCION_ESTADO = 4;
    public static final int OPCION_APAGAR = 5;

    private int dosisCafes;
    private int dosisLeche;
    private int vasosRestantes;
    private double monedero;

    public MaquinaCafe() {
        this.llenarDeposito();
        this.monedero = MINIMO_MONEDERO;
    }

    public int getDosisCafes() {
        return dosisCafes;
    }

    public int getDosisLeche() {
        return dosisLeche;
    }

    public int getVasosRestantes() {
        return vasosRestantes;
    }

    public double getMonedero() {
        return monedero;
    }

    public void llenarDeposito() {
        this.dosisCafes = CAPSULAS_CAFE;
        this.dosisLeche = CAPSULAS_LECHE;
        this.vasosRestantes = NUMERO_VASOS;
    }

    public void vaciarMonedero(double monedero) {
        this.monedero = MINIMO_MONEDERO;
    }

    public String estadoMaquina() {
        return toString();
    }

    public String mostrarMenu() {
        return  OPCION_CAFE + ". Café solo (" + PRECIO_CAFE + " €)\n" +
        OPCION_LECHE+ ". Leche (" + PRECIO_LECHE + " €)\n" +
        OPCION_CAFE_LECHE+ ". Café con leche (" + PRECIO_CAFE_LECHE + " €)\n" +
        OPCION_ESTADO + ". Conocer estado de la máquina\n" +
        OPCION_APAGAR + ". Apagar máquina y salir\n";
    }

    @Override
    public String toString() {
        return "MaquinaCafe{" +
                "dosisCafes=" + dosisCafes +
                ", dosisLeche=" + dosisLeche +
                ", vasosRestantes=" + vasosRestantes +
                ", monedero=" + monedero +
                '}';
    }

    public void servirCafe(int opcion) {
        double precio = 0;

        vasosRestantes--;

        switch (opcion) {
            case OPCION_CAFE:
                dosisCafes--;
                precio = PRECIO_CAFE;
                break;
            case OPCION_LECHE:
                dosisLeche--;
                precio = PRECIO_LECHE;
                break;
            case OPCION_CAFE_LECHE:
                dosisLeche--;
                dosisCafes--;
                precio = PRECIO_CAFE_LECHE;
                break;
        }
        monedero = precio + monedero;
    }
}
