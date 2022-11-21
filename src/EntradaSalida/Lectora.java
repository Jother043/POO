package EntradaSalida;

import java.util.Scanner;

public class Lectora {

    public static Scanner sc = new Scanner(System.in);

    public static double leerDouble (String mensaje){
        System.out.println(mensaje);

        //TODO Cambiar el codigo cuando veamos las excepciones.
        return Double.parseDouble(sc.nextLine());
    }

}
