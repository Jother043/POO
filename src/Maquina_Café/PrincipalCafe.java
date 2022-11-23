package Maquina_Café;

import EntradaSalida.Lectora;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class PrincipalCafe {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        MaquinaCafe maquina = new MaquinaCafe();
        boolean apagarmaquina = false;
        do {
            System.out.println(maquina.mostrarMenu());
            opcion = Lectora.leerEnteroDeRango("¿ Que deseas tomar ? - elige la opción deseada :", 5, 1);
            maquina.servirCafe(opcion);
            switch (opcion) {
                case MaquinaCafe.OPCION_CAFE:
                case MaquinaCafe.OPCION_LECHE:
                case MaquinaCafe.OPCION_CAFE_LECHE:
                    if (controlaExistencia(opcion, maquina)) {
                        cambio(maquina, opcion);
                    }
                case MaquinaCafe.OPCION_ESTADO:
                    System.out.println(maquina);
                case MaquinaCafe.OPCION_APAGAR:
                    apagarmaquina = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!apagarmaquina);
    }

    public static double precioProducto(int opcion) {

        double precio = 0;

        switch (opcion) {
            case MaquinaCafe.OPCION_CAFE:
                precio = MaquinaCafe.PRECIO_CAFE;
                break;
            case MaquinaCafe.OPCION_LECHE:
                precio = MaquinaCafe.PRECIO_LECHE;
                break;
            case MaquinaCafe.OPCION_CAFE_LECHE:
                precio = MaquinaCafe.PRECIO_CAFE_LECHE;
                break;
        }

        return precio;
    }

    public static double pedirDinero(int opcion) {

        switch (opcion) {
            case MaquinaCafe.OPCION_CAFE:
                System.out.println("Introduce : " + MaquinaCafe.PRECIO_CAFE + "€, para un café solo.");
                break;
            case MaquinaCafe.OPCION_LECHE:
                System.out.println("Introduce : " + MaquinaCafe.PRECIO_LECHE + "€, para leche sola.");
                break;
            case MaquinaCafe.OPCION_CAFE_LECHE:
                System.out.println("Introduce : " + MaquinaCafe.PRECIO_CAFE_LECHE + "€, para un café con leche.");
                break;
        }

        return Double.parseDouble(sc.nextLine());
    }

    public static double controlDinero(int opcion) {
        double dineroEntregado = pedirDinero(opcion);

        while (dineroEntregado < pedirDinero(opcion)) {
            if (dineroEntregado > 0) {
                System.out.println("Ha introducido: " + dineroEntregado);
            }
            dineroEntregado = dineroEntregado - pedirDinero(opcion);
        }

        return dineroEntregado;
    }

    public static boolean controlaExistencia(int opcion, MaquinaCafe maquinaCafe) {

        boolean hayExistencia = true;
        switch (opcion) {
            case MaquinaCafe.OPCION_CAFE:
                hayExistencia = maquinaCafe.getVasosRestantes() >= 0 && maquinaCafe.getDosisCafes() >= 0;
                break;
            case MaquinaCafe.OPCION_LECHE:
                hayExistencia = maquinaCafe.getVasosRestantes() >= 0 && maquinaCafe.getDosisLeche() >= 0;
                break;
            case MaquinaCafe.OPCION_CAFE_LECHE:
                hayExistencia = maquinaCafe.getVasosRestantes() >= 0 && maquinaCafe.getDosisCafes() >= 0 && maquinaCafe.getDosisLeche() >= 0;
                break;
        }
        return hayExistencia;
    }

    public static double cambio(MaquinaCafe maquinaCafe, int opcion) {
        double dineroIntroducido = controlDinero(opcion);
        double cambio = dineroIntroducido - precioProducto(opcion);

        if(cambio > maquinaCafe.getMonedero()){
            System.out.println("No disponemos de cambio en estos momentos, por lo que no le podremos procesar su pedido.");
        }else {
            maquinaCafe.servirCafe(opcion);
            if(cambio > 0) {
                System.out.println("cambio de : " + cambio);
            }else{
                System.out.println("Ha introducido el dinero justo.");
            }
        }

        return cambio;
    }

}

