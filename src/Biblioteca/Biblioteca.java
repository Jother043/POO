package Biblioteca;

public class Biblioteca {
    public static final int PRESTAMOS_PERMITIDOS = 2;
    private final int CAPACIDAD_LIBROS = 2;
    private final int CAPACIDAD_USUARIOS = 2;


    private String nombre;
    private Libro[] estanteria;
    private Usuario[] socios;
    private int numeroLibros;
    private int numeroSocios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.numeroLibros = 0;
        this.numeroSocios = 0;
        this.estanteria = new Libro[CAPACIDAD_LIBROS];
        this.socios = new Usuario[CAPACIDAD_USUARIOS];
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Método el cual utilizamos para añadir un ejemplar a la biblioteca. Utilizamos un booleano
     * @param nuevoLibro
     * @throws BibliotecaException
     */
    public void addLibro(Libro nuevoLibro) throws BibliotecaException{
        /*
        Comprobamos que hay libros y si queda hueco entonces lo podremos introducir.
         */
        boolean libroEncontrado = false;
        for(int i = 0; i < estanteria.length && !libroEncontrado; i++){
            if(nuevoLibro.equals(estanteria[i])){
                libroEncontrado = true;
                estanteria[i].addEjemplares(nuevoLibro.getNumeroEjemplares());
            }
        }
        if(!libroEncontrado){
            if(this.numeroLibros < CAPACIDAD_LIBROS){
                estanteria[numeroLibros++]=nuevoLibro;
            }else {
                throw new BibliotecaException("No puedes añadir más libros, la estanterias estan llenas !!.");
            }
        }

    }

    /**
     * Añadimos usuarios al "almacen" (array) de socios.
     * creamos un booleano que nos servirá para saber si esta el socio añadido.
     * recorremos el array para s
     * @param usuario
     */
    public void addSocio(Usuario usuario) throws BibliotecaException {
        //Si no es socio entra en el if.
        if(!esSocio(usuario)) {
            //en el if llamamos al método es socio, que comprueba si el usuario es soscio o no.
            if (numeroSocios < socios.length) {
                usuario.setNumeroSocio(" " + numeroSocios);
                socios[numeroSocios++] = usuario;
            } else {
                throw new BibliotecaException("Lo siento, no caben más socios.");
            }
        }else{
            throw new BibliotecaException("El usuarios, ya es socio");
        }
    }

    /**
     * Realiza el préstamo de un libro teniendo en cuenta que:
     * - haya ejemplares disponibles del libro.
     * - el usuario no tenga más del limite del libro préstamo actualmente.
     *
     * @param usuario
     * @param libro
     * @throws BibliotecaException
     */
    public void prestamo(Usuario usuario, Libro libro) throws BibliotecaException {

        if (!esSocio(usuario)){
            throw new BibliotecaException("El usuario no es soscio de la biblioteca.");
        }
        if(libro.getEjemplaresDisponible()<= 0){
            throw new BibliotecaException("No quedan ejemplares disponibles del libro seleccionado");
        }
        if(usuario.getNumeroLibrosEnPrestamo() >= PRESTAMOS_PERMITIDOS){
            throw new BibliotecaException("El socio, ya tiene libros en prestamo");
        }

    }

    /**
     * Para saber si es socio o no el usuario, creamos este método que retorna un booleano, el cual lo miramos con el número
     * si tiene numero de socios entonces es socio ni el numero de socio es null entonces no existe.
     * @param usuario
     * @return
     */
    public boolean esSocio(Usuario usuario){

        return usuario.getNumeroSocio() != null;
    }

}
