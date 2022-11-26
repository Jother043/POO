package Ordenador;

public class ConstruirOrdenador {
    public static void main(String[] args) {
        MicroProcesador micro = new MicroProcesador("Intel", "i7 10500", 16, 3.20F, "LGA-1151");
        PlacaBase placa = new PlacaBase("ASUS", "T5000", "LGA-1151");
        PlacaBase placa2 = new PlacaBase("ASUS", "AM4", "T5000");
        DiscoDuro hd = new DiscoDuro("Seagate", "SSD", 1000);
        TarjetaGrafica grafica = new TarjetaGrafica("Gigabyte", "RTX3800", 16, 3.5F, 16);


        Ordenador ordenador = new Ordenador(placa, micro, hd, grafica);
        System.out.println(ordenador);
    }

}
