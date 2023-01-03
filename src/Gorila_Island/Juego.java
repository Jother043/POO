package Gorila_Island;

import EntradaSalida.Lectora;

public class Juego {
    private static final int POSICIONES_INV = 16;

    public static void main(String[] args) {
        String nombreUsuario;
        String acciones;
        GameObject[] inventario = new GameObject[POSICIONES_INV];
        /*
         * Creamos un bucle do - while, y un método verificar nombre, el cual lo verificamos de la siguiente manera,
         * le pasamos el nombre de usuario al método verificaNombre, retornamos el nombre pasado con un trim() y isEmpty
         * que nos devolverá verdadero o falso
         */
        do {
            nombreUsuario = Lectora.solicitarCadena("Introduce un nombre de usuario para el protagonista. ");
            Protagonista protagonista = new Protagonista(nombreUsuario, inventario);
        } while (verificaNombre(nombreUsuario));

        System.out.printf("Hola, %S bienvenido ha Gorilla Island. \n", nombreUsuario);
        System.out.println("Esto es una aventura gráfica en modo texto para los alumnos de 1º de DAM del IES Miravent");
        System.out.println("************************************************************************************************");
        System.out.println("Estas son las opciones que puedes realizar.");
        System.out.println("MIRAR: Permite leer la descripción de un objeto cualquiera o un personaje. \n" +
                "COGER: Si el objeto lo permite lo recoge y lo mete en el inventario. \n" +
                "HABLAR: Si el personaje lo permite, habla con el personaje. \n" +
                "ABRIR: Si el objeto lo permite abre el objeto. \n" +
                "DAR: Si el personaje puede recibir objetos, le da el objeto al personaje \n" +
                "EXPLORAR: Describe el escenario, nombrando todos los objetos que hay, y los personajes. \n" +
                "AYUDA: Muestra el nombre de cada acción junto a la descripción de lo que hace. ");
        System.out.println("************************************************************************************************");
        System.out.println("Estás en la playa de Isla Balemy \n" +
                "Bien venido a la Isla Balemy, una pequeña isla de caribe. Una sencilla isla con un pequeño " +
                "pueblo, un gran volcán, y muchos piratas. \n" +
                "Te acabas de despertar en la arena. Tienes mucha sed. Aquella explosión en el barco casi te mata");
        System.out.println("************************************************************************************************");
        acciones = Lectora.solicitarCadena("¿Que quieres hacer ahora? (escribe ayuda para ver las posibles acciones)");
        acciones(acciones);
    }

    public static void acciones(String accionesSolicitada) {
        switch (accionesSolicitada) {
            case "ayuda":
                System.out.println("MIRAR: Permite leer la descripción de un objeto cualquiera o un personaje. \n" +
                        "COGER: Si el objeto lo permite lo recoge y lo mete en el inventario. \n" +
                        "HABLAR: Si el personaje lo permite, habla con el personaje. \n" +
                        "ABRIR: Si el objeto lo permite abre el objeto. \n" +
                        "DAR: Si el personaje puede recibir objetos, le da el objeto al personaje \n" +
                        "EXPLORAR: Describe el escenario, nombrando todos los objetos que hay, y los personajes. \n" +
                        "AYUDA: Muestra el nombre de cada acción junto a la descripción de lo que hace. ");
                break;
            case "coger":

        }
    }

    /**
     * Este método devuelve un booleano verificando así si el nombre no es nulo o solo contiene espacios.
     *
     * @param nombreUsuario
     * @return
     */
    private static boolean verificaNombre(String nombreUsuario) {
        return nombreUsuario.trim().isEmpty();
    }
}
