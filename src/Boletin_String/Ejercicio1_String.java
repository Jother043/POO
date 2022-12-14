package Boletin_String;

import java.util.Scanner;

public class Ejercicio1_String {
    public static Scanner sc = new Scanner(System.in);

    /**
     * Creamos el método main para hacer funcional el programa, este método interactúa con el usuario y muestra
     * la información del numVeces.
     * @param args
     */
    public static void main(String[] args) {
        String cadena;
        char caracter;
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();
        System.out.println("Introduce un caracter");
        caracter = sc.nextLine().charAt(0);
        numVeces(cadena, caracter);
        System.out.println(numVeces(cadena, caracter));
    }

    private static int numVeces(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {

            if (Character.toLowerCase(cadena.charAt(i)) == Character.toLowerCase(caracter)) {

                contador++;
            }
        }
        return contador;
    }
}
