package Rectangulo_POO;

import EntradaSalida.Lectora;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        double altura = Lectora.leerDouble("Introduce la altura");
        double anchura = Lectora.leerDouble("Introduce la anchura");
        Rectangulo r = new Rectangulo((int)altura, (int)anchura );
        System.out.println("La longitud es : " + r.longitud);
        System.out.println("La longitud es : " + r.anchura);
        System.out.println("El perimetro es :  " + r.calcularPerimetro());
    }

}
