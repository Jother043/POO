package Maquina_Café;

import java.util.Scanner;

public class PrincipalCafe {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        MaquinaCafe maquina = new MaquinaCafe();
        boolean apagarmaquina = false;
        do {
            System.out.println(maquina.mostrarMenu());
            System.out.println("¿ Que deseas tomar ? - elige la opción que desee :");
            opcion = Integer.parseInt(sc.nextLine());
            maquina.servirCafe(opcion);
            switch (opcion) {
                case MaquinaCafe.OPCION_CAFE:
                case MaquinaCafe.OPCION_LECHE:
                case MaquinaCafe.OPCION_CAFE_LECHE:
                    if (controlaExistencia(maquina, opcion)) {
                        procesaOpcion(maquina, opcion);
                    }
                case MaquinaCafe.OPCION_ESTADO:
                    System.out.println(maquina);
                case MaquinaCafe.OPCION_APAGAR:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while (opcion != MaquinaCafe.OPCION_APAGAR) ;
    }
    public static double controlarDinero(int opcion) {
        // Comprobamos el dinero introducido
        double dineroIntroducido = 0;

        while (dineroIntroducido < getPrecioOpcion(opcion)) {
            if (dineroIntroducido > 0) {
                System.out.printf("Ha introducido %f €\n", dineroIntroducido);
            }
            dineroIntroducido += pedirDinero(opcion);
        }

        return dineroIntroducido;
    }

    public static double pedirDinero(int opcion) {
        switch (opcion) {
            case MaquinaCafe.OPCION_CAFE:
                System.out.print("Introduce " + MaquinaCafe.PRECIO_CAFE + "€");
                break;
            case MaquinaCafe.OPCION_LECHE:
                System.out.print("Introduce " + MaquinaCafe.PRECIO_LECHE + "€");
                break;
            case MaquinaCafe.OPCION_CAFE_LECHE:
                System.out.print("Introduce " + MaquinaCafe.PRECIO_CAFE_LECHE + "€");
                break;
        }

        return Double.parseDouble(sc.nextLine());
    }

    public static double getPrecioOpcion (int opcion) {
        double precioProducto = 0;

        switch (opcion) {
            case MaquinaCafe.OPCION_CAFE:
                precioProducto = MaquinaCafe.PRECIO_CAFE;
                break;
            case MaquinaCafe.OPCION_LECHE:
                precioProducto = MaquinaCafe.PRECIO_LECHE;
                break;
            case MaquinaCafe.OPCION_CAFE_LECHE:
                precioProducto = MaquinaCafe.PRECIO_CAFE_LECHE;
                break;
        }

        return precioProducto;
    }

    public static double procesaOpcion(MaquinaCafe m, int opcion) {
        double dineroIntroducido = controlarDinero(opcion);

        double cambioADevolver = dineroIntroducido - getPrecioOpcion(opcion);
        if (m.getMonedero() < cambioADevolver) {
            System.out.println("No puedo servir porque no tengo cambio");
        }
        else {
            m.servirCafe(opcion);
        }

        return cambioADevolver;
    }

    public static boolean controlaExistencia(MaquinaCafe m, int opcion) {
        boolean hayExistencias = false;
        switch (opcion) {
            case MaquinaCafe.OPCION_CAFE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisCafes() > 0;
                break;
            case MaquinaCafe.OPCION_LECHE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisLeche() > 0;
                break;
            case MaquinaCafe.OPCION_CAFE_LECHE:
                hayExistencias = m.getVasosRestantes() > 0 && m.getDosisLeche() > 0 && m.getDosisCafes() > 0;
                break;
        }

        return hayExistencias;
    }

}

