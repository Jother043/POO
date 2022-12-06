package Biblioteca;

public class Usuario {
    private static int totalSocios = 1;
    private String nombre;
    private String apellido;
    private String dni;
    private String numeroSocio;

    public Usuario(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.numeroSocio = "" + totalSocios++;
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


}
