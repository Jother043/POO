package Boletin_String;

import EntradaSalida.Lectora;

import java.util.Scanner;

public class Ejercicio5_String {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena = Lectora.solicitarCadena("Introduce una frase :");
        String cadenaBuscada = Lectora.solicitarCadena("Introduce la palabra que se quiere buscar y reemplazar : ");
        String cadenaRemplazar = Lectora.solicitarCadena("Introduce la palabra que por la que quieras sustituir la anterior: ");
        System.out.println(comprobarPalabra(cadena, cadenaBuscada, cadenaRemplazar));
    }

    public static String comprobarPalabra(String cadena, String cadenaBuscada, String cadenaRemplazar) {
        return cadena.replace(cadenaBuscada, cadenaRemplazar);
    }
}
