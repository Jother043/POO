import java.util.Scanner;

public class calculadora {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        System.out.println("Introduce el primer numero a restar");
        num1 =  Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el segundo numero a restar");
        num2 =  Integer.parseInt(sc.nextLine());
        int total = num1 - num2;
        System.out.println("la resta da : " + total);
    }
}
