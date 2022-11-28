package Ordenador_y_videojuego;

public class ConstruirOrdenador {
    public static void main(String[] args) {
        MicroProcesador microProcesador = new MicroProcesador("Intel", "i7 12700K", 12, 5.00f, "LGA-1700");
        PlacaBase placa = new PlacaBase("MSI", "Z690", "LGA-1700");
        PlacaBase placa1 = new PlacaBase("MSI", "Z370", "LGA-1151");
        DiscoDuro discoDuro = new DiscoDuro("Kingstong", "SSD", 1000);
        TarjetaGrafica grafica = new TarjetaGrafica("Gigabyte Aorus Master", "RTX3070", 184, 4f, 8);
        Ordenador ordenador = new Ordenador(placa1, microProcesador, discoDuro, grafica);
        System.out.println(ordenador);
    }

}
