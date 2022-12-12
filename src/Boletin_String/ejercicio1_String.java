package Boletin_String;

import java.util.Scanner;

public class ejercicio1_String {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena;
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();
        char caracter;
        System.out.println("Introduce un caracter");
        caracter = sc.nextLine().charAt(0);
        numVeces(cadena, caracter);
        System.out.println(numVeces());
    }

    private static int numVeces(String cadena, char caracter){
        int contador = 0;
        for(int i = 0; i < cadena.length(); i++){

            if(cadena.charAt(i) == caracter){
                contador += contador;
            }

        }
        return contador;
    }
}
