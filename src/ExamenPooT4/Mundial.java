package ExamenPooT4;

import EntradaSalida.Lectora;

public class Mundial {

    static final int MAX_JUGADORES = 2;
    static final int MAX_EQUIPOS = 4;
    private String nombre;
    private static Equipo[] listaEquipos = new Equipo[MAX_EQUIPOS];

    public Mundial(String nombre, Equipo[] listaEquipos) {
        this.nombre = nombre;
        this.listaEquipos = new Equipo[MAX_EQUIPOS];
    }

    public static void main(String[] args) throws ChapaException {
        int opcion = 0;
        Jugador[] listaJugadores = new Jugador[MAX_JUGADORES];
        Equipo[] listaEquipos = new Equipo[MAX_EQUIPOS];
        Equipo equipo = null;
        Jugador jugador = null;

        do {
            System.out.println("1. Añadir un nuevo equipo. ");
            System.out.println("2. Añadir un nuevo jugador. ");
            System.out.println("3. Ver total de Goles en el mundial. ");
            System.out.println("4. Número de goles jugador. ");
            System.out.println("5. salir. ");
            opcion = Lectora.leerEnteroDeRango("Introduzca la opcion a elegir", 7, 0);


            switch (opcion) {
                case 1:
                    String pais = Lectora.solicitarCadena("Introduce el pais del equipo. ");
                    String Entrenador = Lectora.solicitarCadena("Introduce el nombre del entrenador. ");
                    equipo = new Equipo(pais, Entrenador, listaJugadores);
                    añadirEquipo(equipo);
                    break;
                case 2:

                    boolean existe = false;
                    boolean encontrado = false;
                    String nombreEquipo = "";
                    for (int i = 0; i < listaEquipos.length && !existe; i++) {
                        if (listaEquipos[i] == null) {
                            existe = true;
                        } else {
                            existe = false;
                        }
                    }
                    nombreEquipo = Lectora.solicitarCadena("Introduce el nombre del equipo al que quieres añadir un jugador, ");
                    //Recorremos el bucle hasta .length  y mientras encontrado sea falso.
                    for (int i = 0; i < listaEquipos.length && !encontrado; i++) {
                        //Una vez encontrado igualamos esa casilla donde estaba jugador a null.
                        if (listaEquipos[i].getPais().equals(nombreEquipo)) {
                            equipo = listaEquipos[i];
                            encontrado = true;
                        }
                        if (!encontrado) {
                            throw new ChapaException("No se ha encontrado el jugador a borrar. ");
                        }
                    }
                    if (existe) {
                        String nombre = Lectora.solicitarCadena("Introduce el nombre del jugador");
                        int edad = Lectora.leerEnteroPositivo("Introduce la edad del jugador");
                        int numGoles = 3;
                        jugador = new Jugador(nombre, edad, numGoles);
                        for (int i = 0; i < listaJugadores.length; i++) {
                            if (existe && !(listaJugadores[i].equals(jugador))) {
                                equipo.añadirJugador(jugador);
                            } else if (listaJugadores[i].equals(jugador)) {
                                throw new ChapaException("No se puede dos iguales.");
                            }
                        }
                    }
                    break;
                case 3:
                    nombreEquipo = Lectora.solicitarCadena("Introduce el nombre del equipo para ver sus goles. ");
                    for(int i = 0; i < listaEquipos.length; i++){
                        if(nombreEquipo.equals(equipo.getPais())){
                            numTotalGolesEquipo(equipo);
                        }
                    }
                    break;
                case 4:
                    pais = Lectora.solicitarCadena("Introduce el pais del equipo buscado");
                    String nombreJugador = Lectora.solicitarCadena("Introduce el nombre del jugador ");
                    System.out.println(numGolesJugador(equipo, pais, nombreJugador, jugador));
                    break;

            }

        } while (opcion != 6);
    }

    /**
     * Método que se encarga de añadir los equipos al array de objetos definido.
     *
     * @param nuevoEquipo
     * @throws ChapaException
     */
    public static void añadirEquipo(Equipo nuevoEquipo) throws ChapaException {
        //Creamos un booleano para indicar si hay o no espacio.
        boolean espacio = false;
        /*Recorremos el array de objetos y si esta null significa que hay espacio y ponemos espacio en true
          y se sale del bucle sin tener que llegar al .length
         */
        for (int i = 0; i < listaEquipos.length && !espacio; i++) {
            if (listaEquipos[i] == null) {
                espacio = true;
                listaEquipos[i] = nuevoEquipo;
            }
        }
        //Si el espacio es falso entonces lanzamos la excepción.
        if (!espacio) {
            throw new ChapaException("Lo sentimos este jugador no sera convocado, no hay espacio en el equipo. ");
        }
    }

    /**
     * Este étodo nos busca y elimina el equipo buscado.
     *
     * @param equipoBuscado
     * @param paisEquipo
     * @throws ChapaException
     */
    public static void buscarEquipoEliminar(Equipo equipoBuscado, String paisEquipo) throws ChapaException {
        //Declaramos una variable booleana que nos permitirá salirnos del bucle cuando encuentre la
        boolean encontrado = false;
        //Recorremos el bucle hasta .length  y mientras encontrado sea falso.
        for (int i = 0; i < listaEquipos.length && !encontrado; i++) {
            //Una vez encontrado igualamos esa casilla donde estaba jugador a null.
            if (listaEquipos[i].getPais().equals(paisEquipo)) {
                listaEquipos[i] = null;
                encontrado = true;
            }
            if (!encontrado) {
                throw new ChapaException("No se ha encontrado el equipo. ");
            }
        }
    }

    /**
     * Recorre to do los equipos y los suma a una variable contadora.
     *
     * @param equipo
     * @return
     */
    public static int numTotalGolesEquipo(Equipo equipo) {
        //variable contadora
        int numTotales = 0;
        for (int i = 0; i < listaEquipos.length; i++) {
            numTotales += equipo.numeroGolesEquipo();

        }
        return numTotales;
    }

    /**
     * Este metodo te dice cuantos goles ha marcado el jugador que quieres bucar por equipos.
     *
     * @param equipoBuscado
     * @param paisEquipo
     * @param nombreJugador
     * @param jugadorBuscado
     * @return
     * @throws ChapaException
     */
    public static int numGolesJugador(Equipo equipoBuscado, String paisEquipo, String nombreJugador, Jugador jugadorBuscado) throws ChapaException {
        boolean encontrado = false;
        int golesMundialEquipo = 0;

        for (int i = 0; i < listaEquipos.length && !encontrado; i++) {
            //Una vez encontrado asignamos a equipoBuscado
            if (listaEquipos[i].getPais().equals(paisEquipo)) {
                equipoBuscado = listaEquipos[i];
                encontrado = true;
            }
            if (!encontrado) {
                throw new ChapaException("No se ha encontrado el equipo. ");
            }
        }
        encontrado = false;
        for (int i = 0; i < equipoBuscado.getListaJugadores().length && !encontrado; i++) {
            if (jugadorBuscado.getNombre().equals(nombreJugador)) {
                encontrado = true;
                golesMundialEquipo = jugadorBuscado.getNumGoles();

            }
        }

        return golesMundialEquipo;
    }


}
