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

                case MaquinaCafe.OPCION_ESTADO:
                    System.out.println(maquina.estadoMaquina());
                case MaquinaCafe.OPCION_APAGAR:
                    break;
            }
        }while (apagarmaquina) ;
    }
}
