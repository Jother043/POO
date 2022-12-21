package PracticaExamenPoo.VideoClub;

import EntradaSalida.Lectora;

public class GestionVideoClub {
    static final int MAX_PELICULAS = 20;

    public static void main(String[] args) throws VideoClubException {

        int opcion = 0;
        Pelicula[] bibliotecaAlmacen;
        Pelicula pelicula = null;
        Biblioteca biblioteca = null;
        biblioteca = new Biblioteca(bibliotecaAlmacen = new Pelicula[MAX_PELICULAS]);

        do {
            System.out.println("1. Añadir pelicula. ");
            System.out.println("2. Ver peliculas. ");
            System.out.println("3. Buscar pelicula por titulos. ");
            System.out.println("4. Buscar pelicula por etiqueta. ");
            System.out.println("5. salir. ");
            opcion = Lectora.leerEnteroDeRango("Introduzca la opcion a elegir", 6, 0);


            switch (opcion) {
                case 1:
                    String titulo = Lectora.solicitarCadena("Introduce el titulo de la pelicula. ");
                    int anyo = Lectora.leerEnteroPositivo("Introduce el año de estreno. ");
                    String director = Lectora.solicitarCadena("Introduce el nombre del director. ");
                    double presupuesto = Lectora.leerDoublePositivo("Introduce el presupuesto de la pelicula. ");
                    double recaudacion = Lectora.leerDoublePositivo("Introduce lo recaudado por la pelicula. ");
                    String sinopsis = Lectora.solicitarCadena("Introduce la sinopsis de la pelicula a añadir. ");
                    String etiqueta = Lectora.solicitarCadena("Introduce una etiqueta. ");
                    double valoracion = Lectora.leerDoublePositivo("Introduce la valoración. ");
                    pelicula = new Pelicula(titulo, anyo, director, presupuesto, recaudacion, sinopsis, etiqueta, valoracion);
                    biblioteca.añadirPelicula(pelicula);
                    break;
                case 2:
                    biblioteca.mostrarBiblioteca();
                    break;
                case 3:
                    titulo = Lectora.solicitarCadena("Introduce el nombre del titulo a buscar. ");
                    System.out.println(biblioteca.buscarPeliculaTitulo(pelicula, titulo));
                    break;
                case 4:
                    etiqueta = Lectora.solicitarCadena("Introduce el nombre del titulo a buscar. ");
                    System.out.println(biblioteca.buscarPeliculaEtiqueta(pelicula, etiqueta));
                    break;
            }

        } while (opcion != 4);


    }

}
