package Ordenador_y_videojuego;

public class VideoJuego {

    private String nombre;
    private String company;
    private int year;
    private int numNucleo;
    private float velocidaCpu;
    private int espacioDisco;
    private int numNucleoGpu;
    private int numMemoriaGpu;
    private MicroProcesador cpu;
    private TarjetaGrafica gpu;
    private DiscoDuro discoDuro;

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

    public int getNumNucleo() {
        return numNucleo;
    }

    public float getVelocidaCpu() {
        return velocidaCpu;
    }

    public int getEspacioDisco() {
        return espacioDisco;
    }

    public int getNumNucleoGpu() {
        return numNucleoGpu;
    }

    public int getNumMemoriaGpu() {
        return numMemoriaGpu;
    }

    public MicroProcesador getCpu() {
        return cpu;
    }

    public TarjetaGrafica getGpu() {
        return gpu;
    }


    public boolean comprobarEjecucion(MicroProcesador cpu, TarjetaGrafica gpu, DiscoDuro discoDuro, float velocidaCpu, int numMemoriaGpu, int espacioDisco, int numNucleo, int numNucleoGpu) {

        boolean compatible = false;

        if (MicroProcesador.getNucleos() == numNucleo && MicroProcesador.getVelocidad() == velocidaCpu && DiscoDuro.getCapacidad() == espacioDisco && TarjetaGrafica.getNucleos() == numNucleoGpu && TarjetaGrafica.getMemoria() == numMemoriaGpu) {
            compatible = true;
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
