package Boletin_String;

import EntradaSalida.Lectora;

public class Ejercicio10_String {

    public static void main(String[] args) {
        String direccion = Lectora.solicitarCadena("Introduce la dirección a filtrar.");
        System.out.println(validarDireccion(direccion));
    }

    public static boolean validarDireccion(String direccion) {
        boolean valida = true;
        String[] separadores1 = direccion.split("://");

        if (separadores1.length != 2) {
            valida = false;
        }

        if (valida) {
            String[] separadores2 = separadores1[1].split("\\.");
            if (separadores2.length != 3) {
                valida = false;
            }
            if (valida && !Character.isLetter(separadores2[1].charAt(0))) {
                valida = false;
            }
        }
        return valida;
    }


}
