package Ordenador_y_videojuego;

public class Ordenador {
    //Atributos de la clase Ordenador, que son objetos es decir referencia a otras clases.
    private PlacaBase placa;
    private MicroProcesador micro;
    private DiscoDuro hd;
    private TarjetaGrafica grafica;

    /**
     * Método constructor del ordenador, se encarga de sí placa.comprobarSocket es verdadero, nos mostrará el mensaje
     * y hará el constructor, si no, nos mostrará el mensaje que no es compatible y no hará el constructor por lo que nos dara null.
     * @param placa
     * @param micro
     * @param hd
     * @param grafica
     */
    public Ordenador(PlacaBase placa, MicroProcesador micro, DiscoDuro hd, TarjetaGrafica grafica) {
        //Comprobamos que es compatible socket
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

    /**
     * Método toString para mostrar en caso de ser verdadero, los componentes, pero si no, nos mostrara null
     * ya que no se ha construido.
     * @return String.
     */
    @Override
    public String toString() {
        return "\n Ordenador: \n placa=" + placa + ",\n micro=" + micro + ",\n hd=" + hd + ",\n grafica=" + grafica + ". \n";
    }


}

