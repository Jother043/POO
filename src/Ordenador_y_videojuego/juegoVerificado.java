package Ordenador_y_videojuego;

public class juegoVerificado {
    //Atributos de la clase
    private VideoJuego juego;
    private MicroProcesador cpu;
    private TarjetaGrafica gpu;
    private DiscoDuro discoDuro;
    /**
     * Método constructor, el cual evalúa si es verdadero juego.comprobarEjecución(....), entonces, entramos en el if
     * y mostramos un mensaje e iniciamos el constructor, si no mostramos otro mensaje.
     * @param juego Le pasamos juego por parámetro.
     */
    public juegoVerificado(VideoJuego juego, MicroProcesador cpu, TarjetaGrafica gpu, DiscoDuro discoDuro) {

        if(juego.comprobarEjecucion(cpu, gpu, discoDuro, juego.getVelocidaCpu(), juego.getNumMemoriaGpu(), juego.getEspacioDisco(), juego.getNumNucleo(), juego.getNumNucleoGpu())){
            System.out.println("Enhorabuena, el juego es compatible con su equipo");
            this.juego = juego;
            this.cpu = cpu;
            this.gpu = gpu;
            this.discoDuro = discoDuro;
        }else{
            System.out.println("Vaya, tu equipo no cumple lo requisitos del juego.");
        }

    }



    @Override
    public String toString() {
        return "\n juegoVerificado :" +
                "\n juego=" + juego +
                ",\n cpu=" + cpu +
                ",\n gpu=" + gpu +
                ",\n discoDuro=" + discoDuro +
                '.';
    }
}
