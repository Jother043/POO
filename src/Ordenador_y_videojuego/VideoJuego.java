package Ordenador_y_videojuego;

public class VideoJuego {

    String nombre;
    String company;
    int year;
    int numNucleo;
    float velocidaCpu;
    int espacioDisco;
    int numNucleoGpu;
    int numMemoriaGpu;

    public VideoJuego(String nombre, String company, int year, int numNucleo, float velocidaCpu, int espacioDisco, int numNucleoGpu, int numMemoriaGpu) {
        this.nombre = nombre;
        this.company = company;
        this.year = year;
        this.numNucleo = numNucleo;
        this.velocidaCpu = velocidaCpu;
        this.espacioDisco = espacioDisco;
        this.numNucleoGpu = numNucleoGpu;
        this.numMemoriaGpu = numMemoriaGpu;
    }

    public boolean comprobarEjecucion(DiscoDuro cpu, TarjetaGrafica gpu, DiscoDuro discoDuro, float velocidaCpu, int numMemoriaGpu, int espacioDisco, int numNucleo, int numNucleoGpu){

        boolean compatible = false;

        if(cpu.nucleos == numNucleo && cpu.velocidad == velocidaCpu && discoDuro.capacidad == espacioDisco && gpu.nucleos == numNucleoGpu && gpu.memoria == numMemoriaGpu){
            System.out.println("Enhorabuena, el juego es compatible con su equipo.");
            compatible = true;
        }else {
            System.out.println("El juego no es compatible con su equipo");
        }

        return compatible;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "nombre='" + nombre + '\'' +
                ", company='" + company + '\'' +
                ", year=" + year +
                ", numNucleo=" + numNucleo +
                ", velocidaCpu=" + velocidaCpu +
                ", espacioDisco=" + espacioDisco +
                ", numNucleoGpu=" + numNucleoGpu +
                ", numMemoriaGpu=" + numMemoriaGpu +
                '}';
    }

}
