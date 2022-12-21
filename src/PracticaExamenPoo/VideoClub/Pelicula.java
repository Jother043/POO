package PracticaExamenPoo.VideoClub;

import java.util.Objects;

public class Pelicula {
    private String titulo;
    private int año;
    private String director;
    private double presupuesto;
    private double recaudacion;
    private String etiqutas;
    private double valoracion;

    public Pelicula(String titulo, int año, String director, double presupuesto, double recaudacion, String etiqutas, String etiqueta, double valoracion) {
        this.titulo = titulo;
        this.año = año;
        this.director = director;
        this.presupuesto = presupuesto;
        this.recaudacion = recaudacion;
        this.etiqutas = etiqutas;
        this.valoracion = valoracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Creamos un getter para obtener el titulo para su busqueda.
    public String getTitulo() {
        return titulo;
    }

    public String getEtiqutas() {
        return etiqutas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return año == pelicula.año && Double.compare(pelicula.presupuesto, presupuesto) == 0 && Double.compare(pelicula.recaudacion, recaudacion) == 0 && Double.compare(pelicula.valoracion, valoracion) == 0 && titulo.equals(pelicula.titulo) && director.equals(pelicula.director) && etiqutas.equals(pelicula.etiqutas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, año, director, presupuesto, recaudacion, etiqutas, valoracion);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", año=" + año +
                ", director='" + director + '\'' +
                ", presupuesto=" + presupuesto +
                ", recaudacion=" + recaudacion +
                ", etiqutas='" + etiqutas + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }
}
