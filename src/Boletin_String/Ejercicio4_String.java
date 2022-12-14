package Boletin_String;

import EntradaSalida.Lectora;

import java.util.Scanner;

public class Ejercicio4_String {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena = Lectora.solicitarCadena("Introduce una palabra :");
        String cadenaBuscada = Lectora.solicitarCadena("Introduce la palabra que se quiera buscar en la palabra principal: ");
        if (comprobarPalabra(cadena, cadenaBuscada)) {
            System.out.println("esta contenida");
        } else {
            System.out.println("No esta contenida");
        }
    }

    public static boolean comprobarPalabra(String cadena, String cadenaBuscada) {
        int tamañoLetra = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == cadenaBuscada.charAt(tamañoLetra)) {
                tamañoLetra++;
            }
            if (tamañoLetra == cadenaBuscada.length()) {
                return true;
            }
        }


        return false;
    }
}
