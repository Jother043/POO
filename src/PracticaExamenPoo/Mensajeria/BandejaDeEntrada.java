package PracticaExamenPoo.Mensajeria;

import EntradaSalida.Lectora;

import java.util.SortedMap;

public class BandejaDeEntrada {
    public static void main(String[] args) {
        Mensaje mensaje = null;
        Mensaje[] buzon = new Mensaje[5];
        Persona persona = new Persona("Jose", buzon);

        int opciones = Lectora.leerEnteroDeRango("Introduce la opcion entre 1 y 3 siendo 3 salir :", 4, 0);
        do {
            switch (opciones) {
                case 1:
                    System.out.println("Comprobar buzón: ");
                    //persona.mostrarBuzon(mensaje , buzon);
                    break;
                case 2:
                    System.out.println("Enviar mensaje: ");

                    break;
                case 3:
                    System.out.println("Eliminar ultimo mensaje: ");
                    break;
                default:
                    System.out.println("Opción no valida. ");
                    break;
            }
        } while (opciones == 4);
    }
}
