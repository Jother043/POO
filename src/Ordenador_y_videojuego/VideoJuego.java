package Ordenador_y_videojuego;

public class VideoJuego {
    //Atributos de la clase VideoJuego.
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

    /**
     * Constructor de la clase VideoJuego.
     * @param nombre
     * @param company
     * @param year
     * @param numNucleo
     * @param velocidaCpu
     * @param espacioDisco
     * @param numNucleoGpu
     * @param numMemoriaGpu
     */
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

    /**
     * Método, que nos comprueba la compatibilidad del Videojuego, pasamos por parámetros, CPU, GPU, Disco duro, y todos
     * los atributos de la clase, Creamos una variable booleana, ya que devolveremos un booleano, la cual nos indicara la compatibilidad.
     * @param cpu
     * @param gpu
     * @param discoDuro
     * @param velocidaCpu
     * @param numMemoriaGpu
     * @param espacioDisco
     * @param numNucleo
     * @param numNucleoGpu
     * @return booleano
     */

    public boolean comprobarEjecucion(MicroProcesador cpu, TarjetaGrafica gpu, DiscoDuro discoDuro, float velocidaCpu, int numMemoriaGpu, int espacioDisco, int numNucleo, int numNucleoGpu) {

        return MicroProcesador.getNucleos() >= numNucleo && MicroProcesador.getVelocidad() >= velocidaCpu && DiscoDuro.getCapacidad() >= espacioDisco && gpu.getNucleos() >= numNucleoGpu && gpu.getMemoria() >= numMemoriaGpu;
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
