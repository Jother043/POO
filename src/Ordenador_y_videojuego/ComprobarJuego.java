package Ordenador_y_videojuego;

public class ComprobarJuego {
    public static void main(String[] args) {
        MicroProcesador microProcesador = new MicroProcesador("Intel", "i7 12700K", 12, 5.00f, "LGA-1700");
        PlacaBase placa = new PlacaBase("MSI", "Z690", "LGA-1700");
        DiscoDuro discoDuro = new DiscoDuro("Kingstong", "SSD", 1000);
        TarjetaGrafica grafica = new TarjetaGrafica("Gigabyte Aorus Master", "RTX3070", 184, 4f, 8);
        Ordenador ordenador = new Ordenador(placa, microProcesador, discoDuro, grafica);
        VideoJuego juego1 = new VideoJuego("Battlefield V", "EA", 2020 , 12, 5.00f, 1000, 184, 8);
        VideoJuego juego2 = new VideoJuego("Battlefield V", "EA", 2020, 12, 5.00f, 1000, 184, 8);
        juegoVerificado juegoVerificado = new juegoVerificado(juego1);
        System.out.println(juego1);
        System.out.println(ordenador);
    }

}
