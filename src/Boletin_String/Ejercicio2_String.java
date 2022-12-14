package Boletin_String;

import java.util.Scanner;

public class Ejercicio2_String {
    private static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        String cadena;
        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine();
        System.out.println(contarMayus(cadena) + contarMinus(cadena) + contarNum(cadena));

    }

    private static int contarMayus(String cadena){

        int total = 0;
        for (int i = 0; i < cadena.length(); i++){
            if(Character.isUpperCase(cadena.charAt(i))){
                total++;
            }
        }
        return total;
    }
    private static int contarMinus(String cadena){

        int total = 0;
        for (int i = 0; i < cadena.length(); i++){
            if(Character.isDigit(cadena.charAt(i))){
                total++;
            }
        }
        return total;
    }
    private static int contarNum(String cadena){
        int total = 0;
        for (int i = 0; i < cadena.length(); i++){

        }
        return total;
    }

}
