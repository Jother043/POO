package GeneraPersona;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private char sexo;
    private LocalDate fechaNacimiento;
    private int dni;
    private float altura;
    private float peso;

    public Persona(String nombre, LocalDate fechaNacimiento, int dni, float altura, float peso, char sexo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getLetra(){
        return getLetraDni(this.dni);
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public static char getLetraDni(int dni){
        char caracteres[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return caracteres[dni % 23];
    }

    public float getIMC(){
        return (float) (peso/Math.pow(altura, 2));
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", fechaNacimiento=" + fechaNacimiento.format(DateTimeFormatter.ofPattern(" dd/LLL/yyyy")) +
                ", dni=" + dni +
                ", altura=" + altura +
                ", peso=" + peso +
                ", letra=" + getLetraDni(dni) +
                '}';
    }
}
