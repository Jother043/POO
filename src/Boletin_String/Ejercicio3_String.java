package Boletin_String;

import EntradaSalida.Lectora;

import java.util.Scanner;

public class Ejercicio3_String {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String cadena;
        cadena = Lectora.solicitarCadena("Introduce una palabra para comprobar si es un palindromo :");
        if(comprobarPalindromo(cadena)){
            System.out.println("Es palíndromo");
        }else{
            System.out.println("No es palíndromo");
        }
    }

    public static boolean comprobarPalindromo(String cadena){
        StringBuilder sinEspacio = new StringBuilder();
        String[] espacioOff = cadena.split(" ");
        for(int i = 0;i < espacioOff.length ; i++){
            sinEspacio.append(espacioOff[i]);
        }

        return sinEspacio.toString().equals(sinEspacio.reverse().toString());
    }
}
