package EntradaSalida;

import java.util.Scanner;

public class Lectora {

    public static Scanner sc = new Scanner(System.in);

    /**
     * Este metodo se encarga de pedir al usuario un double por teclado, controlando las excepciones.
     * @param mensaje Pasamos mensaje por parametro, el cual será el que se le muestre al usuario.
     * @return
     */
    public static double leerDouble(String mensaje) {
        //Mostramos el mensaje por pantalla.
        System.out.println(mensaje);
        //Declaramos las variables necesarias.
        double res = 0;
        boolean ok = false;
        //Hacemos un do, para controlar que se repita mientras ok sea falso
        do {
            try {
                //pedimos el número y ponemos ok como true, si no fuera un número nos saltaría la excepción
                res = Double.parseDouble(sc.nextLine());
                ok = true;
                //Capturamos la excepción y mostramos el error
            } catch (NumberFormatException e) {
                System.out.println("Tienes que introducir un número.");
            }
        } while (!ok);

        return res;
    }

    public static int leerEnteroDeRango(String mensaje, int numMax, int nunMin) {
        int opcionIntroducido = 0;
        boolean enRango = false;
        while (!enRango) {
            try {
                System.out.println(mensaje);
                opcionIntroducido = Integer.parseInt(sc.nextLine());
                if (opcionIntroducido > nunMin && opcionIntroducido < numMax) {
                    enRango = true;
                } else {
                    System.out.println("Numero fuera del rango.");

                }
            } catch (NumberFormatException e) {
                System.out.println("Tienes que introducir un número.");
            }
        }
        return opcionIntroducido;
    }

    public static int leerEnteroPositivo(String mensaje) {
        int enteroPositivo = 0;
        boolean ok = false;
        while (!ok) {
            System.out.println(mensaje);
            try {
                enteroPositivo = Integer.parseInt(sc.nextLine());
                if (enteroPositivo >= 0) {
                    ok = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Tienes que introducir un número.");
            }
        }

        return enteroPositivo;
    }

    public static char leerCaracter(String mensaje) {
        char cracterIntroducido = ' ';
        boolean ok = false;
        while (!ok) {
            System.out.println(mensaje);
            try {
                cracterIntroducido = sc.next().charAt(0);
                ok = true;

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Esta fuera de rango");
            }
        }
        return cracterIntroducido;
    }
}
