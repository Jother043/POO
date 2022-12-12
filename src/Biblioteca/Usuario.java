package Biblioteca;

import java.util.Objects;

public class Usuario {
    private int totalSocios = 1;
    private String nombre;
    private String apellido;
    private String dni;
    private String numeroSocio;
    private Libro[] prestamo;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.prestamo = new Libro[Biblioteca.PRESTAMOS_PERMITIDOS];
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getNumeroLibrosEnPrestamo() {
        int librosEnPrestamo = 0;
        for (int i = 0; i < prestamo.length && prestamo[i] != null; i++) {
            librosEnPrestamo++;
        }

        return librosEnPrestamo;
    }

    public void prestamo(Libro libro) {

        for (int i = 0; i < prestamo.length; i++) {
            if (prestamo[i] == null) {
                prestamo[i] = libro;
                libro.prestamo();
                break;
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return dni.equals(usuario.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
