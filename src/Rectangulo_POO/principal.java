package Rectangulo_POO;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el largo: ");
        int altura = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el ancho: ");
        int anchura = Integer.parseInt(sc.nextLine());
        Rectangulo r = new Rectangulo(altura, anchura );
        System.out.println("La longitud es : " + r.longitud);
        System.out.println("La longitud es : " + r.anchura);
        System.out.println("El perimetro es :  " + r.calcularPerimetro());
    }

}
