package Biblioteca;

public class Biblioteca {
    private final int CAPACIDAD_LIBROS = 2;
    private final int CAPACIDAD_USUARIOS = 2;

    private String nombre;
    private Libro[] estanteria;
    private Usuario[] socios;
    private int numeroLibros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.numeroLibros = 0;
        this.estanteria = new Libro[CAPACIDAD_LIBROS];
        this.socios = new Usuario[CAPACIDAD_USUARIOS];
    }

    public String getNombre() {
        return nombre;
    }

    public void addLibro(Libro nuevoLibro) throws BibliotecaException{
        /*
        Comprobamos que hay libros y si queda hueco entonces lo podremos introducir.
         */
        if(this.numeroLibros < CAPACIDAD_LIBROS){
            estanteria[numeroLibros++]=nuevoLibro;

        }else {
            throw new BibliotecaException();
        }

    }
}
