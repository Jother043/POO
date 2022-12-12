import java.util.Scanner;

public class calculadora {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String correo = "";
        System.out.println();
       correo = sc.nextLine();
        devolverDominio(correo);

    }

    private static String devolverDominio (String correo){
        int posicion = correo.indexOf("@");
        int posicion2 = correo.indexOf(".");
        String correo2 = correo.substring(posicion+1, posicion2);
        System.out.println(correo2);
        return correo;
    }
}
