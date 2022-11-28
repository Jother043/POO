package Ordenador_y_videojuego;

public class juegoVerificado {
    private VideoJuego juego;
    private MicroProcesador cpu;
    private TarjetaGrafica gpu;
    private DiscoDuro discoDuro;
    public juegoVerificado(VideoJuego juego) {

        if(juego.comprobarEjecucion(cpu, gpu, discoDuro, juego.velocidaCpu, juego.numMemoriaGpu, juego.espacioDisco, juego.numNucleo, juego.numNucleoGpu)){
            System.out.println("Enhorabuena, el juego es compatible con su equipo.");
        }else{
            System.out.println("Vaya, no cumple lo requisitos");
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
