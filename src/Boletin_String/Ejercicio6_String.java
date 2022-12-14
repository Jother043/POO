package Boletin_String;

import EntradaSalida.Lectora;

import java.util.Scanner;

public class Ejercicio6_String {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena = Lectora.solicitarCadena("Introduce una palabra:");

        System.out.println(contarVocales(cadena));
    }

    public static int contarVocales(String cadena) {

        int numVocales = 0;
        String guardar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a'|| cadena.charAt(i) == 'e'|| cadena.charAt(i) == 'i'|| cadena.charAt(i) == 'o'|| cadena.charAt(i) == 'u'){
                numVocales++;
                if(!guardar.contains(String.valueOf(cadena.charAt(i)))){
                    guardar = guardar.concat(String.valueOf(cadena.charAt(i)));
                }
            }
        }

        return guardar.length();
    }
}
