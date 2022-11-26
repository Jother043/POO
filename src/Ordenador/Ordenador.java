package Ordenador;

public class Ordenador {
    private PlacaBase placa;
    private MicroProcesador micro;
    private DiscoDuro hd;
    private TarjetaGrafica grafica;

    public Ordenador(PlacaBase placa, MicroProcesador micro, DiscoDuro hd, TarjetaGrafica grafica) {

        if (placa.comprobaSocket(micro)) {
            this.placa = placa;
            this.micro = micro;
            this.hd = hd;
            this.grafica = grafica;
        }
        else {
            System.out.println("La placa base no es compatible con el microprocesador");
        }

    }

    @Override
    public String toString() {
        return "Ordenador [placa=" + placa + ", micro=" + micro + ", hd=" + hd + ", grafica=" + grafica + "]";
    }


}

