package ExamenPooT4;

import java.util.Arrays;

public class Equipo {

    private final int MAX_JUGADORES = 2;
    private String pais;
    private String Entrenador;
    private Jugador[] listaJugadores;

    public Equipo(String pais, String entrenador, Jugador[] listaJugadores) {
        this.pais = pais;
        Entrenador = entrenador;
        this.listaJugadores = new Jugador[MAX_JUGADORES];
    }

    public String getPais() {
        return pais;
    }

    public Jugador[] getListaJugadores() {
        return listaJugadores;
    }

    /**
     * Este método se encarga de añadir un jugador al equipo mediante un bucle for,
     * después tenemos una condición que si el espacio de listaJugadores es = null
     * entonces podemos introducir un jugador.
     *
     * @param nuevoJugador
     * @throws ChapaException
     */
    public void añadirJugador(Jugador nuevoJugador) throws ChapaException {
        //Creamos un booleano para indicar si hay o no espacio.
        boolean espacio = false;
        /*Recorremos el array de objetos y si esta null significa que hay espacio y ponemos espacio en true
          y se sale del bucle sin tener que llegar al length
         */
        for (int i = 0; i < listaJugadores.length && !espacio; i++) {

            if (listaJugadores[i] == null ) {
                espacio = true;
                listaJugadores[i] = nuevoJugador;
            }
        }
        //Si el espacio es falso entonces lanzamos la excepción.
        if (!espacio) {
            throw new ChapaException("Lo sentimos este jugador no sera convocado, no hay espacio en el equipo. ");
        }

    }

    /**
     * Este método se encarga de buscar por el nombre del jugador y eliminarlo de la lista.
     * Esto lo conseguimos mediante un bucle for con un booleano, ya que si no nos puede saltar una excepción
     * nullPointerException.
     *
     * @param jugadorBuscado
     * @param nombreJugador
     * @throws ChapaException
     */
    public void buscarJugadorEliminar(Jugador jugadorBuscado, String nombreJugador) throws ChapaException {
        //Declaramos una variable booleana que nos permitirá salirnos del bucle cuando encuentre la
        boolean encontrado = false;
        //Recorremos el bucle hasta length y mientras encontrado sea falso.
        for (int i = 0; i < listaJugadores.length && !encontrado; i++) {
            //Una vez encontrado igualamos esa casilla donde estaba jugador a null.
            if (listaJugadores[i].getNombre().equals(nombreJugador)) {
                listaJugadores[i] = null;
                encontrado = true;
            }
            if (!encontrado) {
                throw new ChapaException("No se ha encontrado el jugador a borrar. ");
            }
        }
    }

    public String getEntrenador(){
        return getEntrenador();
    }

    /**
     * Este método se encarga de recorrer el array buscando el número de goles y añadiéndolo a un contador.
     *
     * @return
     */
    public int numeroGolesEquipo() {
        int numGoles = 0;
        boolean existeJugador = false;
        for (int i = 0; i < listaJugadores.length && !existeJugador; i++) {
            if(!(listaJugadores[i]==null)){
                numGoles = listaJugadores[i].getNumGoles();
            }else{
                existeJugador = true;
            }

        }
        return numGoles;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                ", pais='" + pais + '\'' +
                ", Entrenador='" + Entrenador + '\'' +
                ", listaJugadores=" + Arrays.toString(listaJugadores) +
                '}';
    }
}
