package cuenta;

import EntradaSalida.Lectora;

import java.util.Scanner;

public class CuentaPrincipal {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion; //Creamos la variable opciones con la cual elegiremos los casos de switch
        Cuenta cuenta; // le asignamos a Cuenta, cuenta.
        char salir; //Creamos una variable char para elegir la opción de salir.

        System.out.printf("  ____                                     ____       _      __  __ \n" +
                " | __ )    __ _   _ __     ___    ___     |  _ \\     / \\    |  \\/  |\n" +
                " |  _ \\   / _` | | '_ \\   / __|  / _ \\    | | | |   / _ \\   | |\\/| |\n" +
                " | |_) | | (_| | | | | | | (__  | (_) |   | |_| |  / ___ \\  | |  | |\n" +
                " |____/   \\__,_| |_| |_|  \\___|  \\___/    |____/  /_/   \\_\\ |_|  |_|");

        System.out.println("");
        System.out.println("");
        double saldoInicial = CuentaPrincipal.saldo(); //Le decimos que el saldoInicial es igual a
        cuenta = new Cuenta(saldoInicial);

        do {
            opcion = CuentaPrincipal.menu(); //  Muestra el menú y solicita la opción
            salir = CuentaPrincipal.opciones(opcion, cuenta); // Trata cada una de las opciones del menú
        } while (salir == 'n');
    }

    /**
     * Este método se encarga de pedir el saldo inicial para poder hacer las gestiones necesarias.
     * @return saldoInicial, que sera de tipo double
     */
    private static double saldo() {
        double saldoInicial;  

        do
        {
            System.out.println("Introduce el saldo inicial: ");
            saldoInicial = Double.parseDouble(teclado.nextLine());
        } while (saldoInicial < 0); //Se repetirá el código mientras sea menor que 0, en el momento que introduce un número mayor que 0 ya te pasaría al menú.

        return saldoInicial;
    }

    private static int menu() {
        int opcion;//Creamos la variable opción, con la cual indicaremos los que queremos hacer en el menú.

        do {
            System.out.printf(" ___    _ __     ___  (_)   ___    _ __     ___   ___ \n" +
                    "  / _ \\  | '_ \\   / __| | |  / _ \\  | '_ \\   / _ \\ / __|\n" +
                    " | (_) | | |_) | | (__  | | | (_) | | | | | |  __/ \\__ \\\n" +
                    "  \\___/  | .__/   \\___| |_|  \\___/  |_| |_|  \\___| |___/\n" +
                    "         |_|                                            ");
            System.out.println();
            System.out.println("Elige una opción:");
            System.out.println("1. Hacer un ingreso.");
            System.out.println("2. Hacer un reintegro.");
            System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
            System.out.println("4. Finalizar las operaciones.");
            opcion = Integer.parseInt(teclado.nextLine());

            if (opcion < 1 || opcion > 4)
                System.out.println("Error. Opción incorrecta."); //Si la opción introducida es menor que 1 o la opción es mayor que 0, nos saltara un error.
            //El bucle termina cuando una de las dos condiciones se cumple. Mientras opción sea menor que 1 se repetirá.
        } while (opcion < 1 || opcion > 4);

        return opcion;
    }

    private static char opciones(int opcion, Cuenta cuenta) {
        double cantidad;
        char salir = 'n';

        switch (opcion) {
            case 1:
                cuenta.ingresar(Lectora.leerDouble("Introduce una cantidad"));
                break;

            case 2:
                System.out.println("Introduce la cantidad a retirar: ");
                cantidad = Double.parseDouble(teclado.nextLine());
                cuenta.reintegro(cantidad);
                break;

            case 3:
                System.out.println(cuenta);
                break;

            case 4:
                do {
                    System.out.println("¿Estás seguro (s/n)? ");
                    salir = teclado.nextLine().charAt(0);
                    // Esto convierte el carácter salir a minúsculas
                    salir = Character.toLowerCase(salir);
                } while (salir != 's' && salir != 'n');

                if (salir == 's') {
                    System.out.println("Dispones de " + cuenta.getSaldo()
                            + "€ de saldo.");
                }

                break;

        }
        return salir;
    }
}
