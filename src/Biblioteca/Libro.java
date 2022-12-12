package Biblioteca;

import java.util.Objects;
//Creamos los atributos de libro.
public class Libro {
    private String nombre;
    private String autor;
    private String sinopsis;
    private int numeroEjemplares;
    private int ejemplaresDisponible;

    //Creamos el constructor del libro con los atributos.
    public Libro(String nombre, String autor, String sinopsis, int numeroEjemplares) {
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresDisponible = numeroEjemplares;
    }
    //Creamos los getters y setters correspondientes.
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

    public int getEjemplaresDisponible() {
        return ejemplaresDisponible;
    }

    /**
     * Creamos el método añadirEjemplares, el cual lo que hace es que si el numero de ejemplares es mayor a 0 entonces,
     * podemos añadir 1, si no lanzamos una excepción.
     * @param numeroEjemplares
     * @throws BibliotecaException
     */
    public void addEjemplares(int numeroEjemplares) throws BibliotecaException {
        if(numeroEjemplares > 0){
            this.numeroEjemplares += numeroEjemplares;
        }else{
            throw new BibliotecaException("No puedes añdir un numero negativo de ejemplares");
        }
    }

    /**
     * Creamos un metodo prestamo que resta a los ejemplares disponibles cada vez que alguein hace un prestamo de un libro.
     */
    public void prestamo(){
        this.ejemplaresDisponible--;
    }

    /**
     * Este método sirve para comparar dos objetos.
     * Lo primero que hace es ver si estan en la misma dirección de memoria
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro otherLibro = (Libro) obj;
        return nombre.equals(otherLibro.nombre) && autor.equals(otherLibro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor, sinopsis, numeroEjemplares);
    }

}
