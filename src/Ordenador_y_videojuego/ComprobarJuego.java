package Ordenador_y_videojuego;

public class ComprobarJuego {
    public static void main(String[] args) {
        VideoJuego juego1 = new VideoJuego("Battlefield V", "EA", 1 / 2020, 12, 5.00f, 1000, 184, 8);
        VideoJuego juego2 = new VideoJuego("Battlefield V", "EA", 1 / 2020, 12, 5.00f, 1000, 184, 8);
        juegoVerificado juegoVerificado = new juegoVerificado(juego1);
        System.out.println(juego1);
    }

}
