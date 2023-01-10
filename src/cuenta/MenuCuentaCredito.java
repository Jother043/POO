package cuenta;

import EntradaSalida.Lectora;

public class MenuCuentaCredito {

    public static void main(String[] args) {
        //Le pido el nombre al usuario para dirigirme a él.
        String nombre = Lectora.solicitarCadena("Introduce tu nombre : ");
        //Creo la variable que me indicara la opción elegida.
        int opcion = 0;
        //Inicializo el objeto de tipo CuentaCredito.
        CuentaCredito cuenta = new CuentaCredito(0, 100);
        //Saludos al usuario
        System.out.println("Bienvenido " + nombre + " a tu cuenta de crédito");
        System.out.println("En la cuenta de crédito el saldo puede quedar en -" + cuenta.getCredito());
        /*
        Creo un bucle el cual siempre nos mostrará el menú y nos pedirá el numero de opción.
         */
        do {
            System.out.println(menu());
            opcion = Lectora.leerEnteroDeRango("Introduce una opción: ", 5, 0);
            opciones(opcion, cuenta);

        } while (opcion < 4);
    }

    /**
     * Este método se encarga de gestionar las opciones del menú, haciendo llamadas a métodos de la clase CuentaCredito
     * y a su vez esta llamar a métodos del padre Cuenta, gracias a la herencia.
     * @param opcion
     * @param cuenta
     */
    public static void opciones(int opcion, CuentaCredito cuenta) {

        switch (opcion) {
            case 1:
                cuenta.ingresar(Lectora.leerDouble("Introduce la cantidad de dinero a ingresar. "));
                break;
            case 2:
                cuenta.reintegro(Lectora.leerDouble("Introduce la cantidad a retirar de la cuenta de crédito"));
                break;
            case 3:
                System.out.println(cuenta.toString());
                break;
        }
    }

    /**
     * Método encargado de mostrar el menú, teniendo cuenta como parámetro.
     * @return sb.toString();
     */
    public static String menu() {

        StringBuilder sb = new StringBuilder();
        sb.append("Elige una operación").append("\n");
        sb.append("1. Ingresar dinero ").append("\n");
        sb.append("2. Sacar dinero ").append("\n");
        sb.append("3. Mostrar saldo y crédito").append("\n");
        sb.append("4. Salir");


        return sb.toString();

    }


}
