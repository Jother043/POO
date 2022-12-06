package Biblioteca;

public class Libro {
    private String nombre;
    private String autor;
    private String sinopsis;
    private int numeroEjemplares;

    public Libro(String nombre, String autor, String sinopsis, int numeroEjemplares) {
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.numeroEjemplares = numeroEjemplares;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }
}
