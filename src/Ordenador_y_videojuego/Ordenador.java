package Ordenador_y_videojuego;

public class Ordenador {
    private PlacaBase placa;
    private MicroProcesador micro;
    private DiscoDuro hd;
    private TarjetaGrafica grafica;

    public Ordenador(PlacaBase placa, MicroProcesador micro, DiscoDuro hd, TarjetaGrafica grafica) {

        if (placa.comprobaSocket(micro)) {
            System.out.println("Todas las piezas son compatibles.");
            this.placa = placa;
            this.micro = micro;
            this.hd = hd;
            this.grafica = grafica;
        }
        else {
            System.out.println("El procesador y la placa tienen que ser del mismo socket.");
        }
    }

    @Override
    public String toString() {
        return "\n Ordenador: \n placa=" + placa + ",\n micro=" + micro + ",\n hd=" + hd + ",\n grafica=" + grafica + ". \n";
    }


}

