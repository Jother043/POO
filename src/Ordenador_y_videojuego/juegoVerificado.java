package Ordenador_y_videojuego;

public class juegoVerificado {
    private VideoJuego juego;
    private DiscoDuro cpu;
    private TarjetaGrafica gpu;
    private DiscoDuro discoDuro;
    public juegoVerificado(VideoJuego juego) {

        if(juego.comprobarEjecucion(cpu, gpu, discoDuro, juego.velocidaCpu, juego.numMemoriaGpu, juego.espacioDisco, juego.numNucleo, juego.numNucleoGpu)){
            System.out.println("Es compatible");
        }else{
            System.out.println("No es compatible");
        }

    }

    @Override
    public String toString() {
        return "juegoVerificado{" +
                "juego=" + juego +
                ", cpu=" + cpu +
                ", gpu=" + gpu +
                ", discoDuro=" + discoDuro +
                '}';
    }
}
