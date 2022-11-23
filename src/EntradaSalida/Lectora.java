package EntradaSalida;

import java.util.Scanner;

public class Lectora {

    public static Scanner sc = new Scanner(System.in);

    public static double leerDouble(String mensaje) {
        System.out.println(mensaje);
        double res = 0;
        boolean ok = false;

        do {
            try {
                res = Double.parseDouble(sc.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Tienes que introducir un número.");
            }
        } while (!ok);

        return res;
    }

    public static int leerEnteroDeRango(String mensaje, int numMax, int nunMin) {
        int opcionIntroducido = 0;
        do {
            System.out.println(mensaje);
            opcionIntroducido = Integer.parseInt(sc.nextLine());
            if (opcionIntroducido < nunMin || opcionIntroducido > numMax) {
                System.out.println("Numero fuera de rango");
            }
        } while (opcionIntroducido < nunMin || opcionIntroducido > numMax);
        //TODO Cambiar el codigo cuando veamos las excepciones.
        return opcionIntroducido;
    }
}
