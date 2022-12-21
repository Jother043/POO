package PracticaExamenPoo.VideoClub;

import EntradaSalida.Lectora;

public class Biblioteca {
    private final int MAX_PELICULAS = 20;
    private static Pelicula[] bibliotecaAlmacen;

    public Biblioteca(Pelicula[] biblioteca) {
        this.bibliotecaAlmacen = new Pelicula[MAX_PELICULAS];

    }

    /**
     * Este método se encarga de añadir peliculas al array de objetos peliculas.
     * @param nuevaPelicula
     * @throws VideoClubException
     */
    public void añadirPelicula(Pelicula nuevaPelicula) throws VideoClubException {
        //Creamos un booleano para indicar si hay o no espacio.
        boolean espacio = false;
        /*Recorremos el array de objetos y si esta null significa que hay espacio y ponemos espacio en true
          y se sale del bucle sin tener que llegar al .length
         */
        for (int i = 0; i < bibliotecaAlmacen.length && !espacio; i++) {
            if (bibliotecaAlmacen[i] == null) {
                espacio = true;
                bibliotecaAlmacen[i] = nuevaPelicula;
            }
        }
        //Si el espacio es falso entonces lanzamos la excepción.
        if (!espacio) {
            throw new VideoClubException("No hay espacio en la biblioteca de peliculas. ");
        }

    }

    /**
     * Este método se encarga de mostrarnos las pelis que estan en la biblioteca.
     * Recorriendo el array de objetos y pintandolos
     */
    public void mostrarBiblioteca() {
        for (int i = 0; i < bibliotecaAlmacen.length; i++) {
            if(bibliotecaAlmacen[i] != null){
                System.out.println(bibliotecaAlmacen[i]);
            }
        }
    }

    /**
     * Este método devuelve un string de la pelicula buscada por el titulo,
     * Buscamos el titulo mediante un for y si la condición se cumple  devolvemos true en el boolean y,
     * nos saldremos del bocle y nos devolvera el toString de la pelicula buscada.
     *
     * @param peliculaBuscada
     * @param tituloBuscado
     * @return
     */
    public String buscarPeliculaTitulo(Pelicula peliculaBuscada, String tituloBuscado) throws VideoClubException {
        //Declaramos una variable booleana que nos permitirá salirnos del bucle cuando encuentre la
        boolean encontrado = false;
        for (int i = 0; i < bibliotecaAlmacen.length && !encontrado; i++) {
            if (bibliotecaAlmacen[i].getTitulo().contains(tituloBuscado)) {
                peliculaBuscada = bibliotecaAlmacen[i];
                encontrado = true;
            }
            if (!encontrado) {
                throw new VideoClubException("No se ha encontrado la pelicula deseada. ");
            }
        }
        return peliculaBuscada.toString();
    }

    public String buscarPeliculaEtiqueta(Pelicula peliculaBuscada, String etiquetaBuscada) throws VideoClubException {
        //Declaramos una variable booleana que nos permitirá salirnos del bucle cuando encuentre la
        boolean encontrado = false;
        for (int i = 0; i < bibliotecaAlmacen.length && !encontrado; i++) {
            if (bibliotecaAlmacen[i].getEtiqutas().contains(etiquetaBuscada)) {
                peliculaBuscada = bibliotecaAlmacen[i];
                encontrado = true;
            }
            if (!encontrado) {
                throw new VideoClubException("No se ha encontrado la pelicula deseada. ");
            }
        }
        return peliculaBuscada.toString();
    }


}
