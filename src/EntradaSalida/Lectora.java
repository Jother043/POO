package EntradaSalida;

import java.util.Scanner;

public class Lectora {

    public static Scanner sc = new Scanner(System.in);

    public static double leerDouble (String mensaje){
        System.out.println(mensaje);

        //TODO Cambiar el codigo cuando veamos las excepciones.
        return Double.parseDouble(sc.nextLine());
    }
    public static int leerEnteroDeRango (String mensaje, int numMax, int nunMin){
        int opcionIntroducido = 0;
        do{
            System.out.println(mensaje);
            opcionIntroducido = Integer.parseInt(sc.nextLine());
            if(opcionIntroducido < nunMin || opcionIntroducido > numMax ){
                System.out.println("Numero fuera de rango");
            }
        }while(opcionIntroducido < nunMin || opcionIntroducido > numMax );
        //TODO Cambiar el codigo cuando veamos las excepciones.
        return opcionIntroducido;
    }
}
