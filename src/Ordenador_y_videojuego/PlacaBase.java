package Ordenador_y_videojuego;

public class PlacaBase {
    //Creamos los atributos de PlacaBase.
    private String nombre;
    private String chipset;
    private String socket;

    /**
     * Creamos un constructor con los siguientes parámetros.
     * @param nombre
     * @param chipset
     * @param socket
     */
    public PlacaBase(String nombre, String chipset, String socket) {
        this.nombre = nombre;
        this.chipset = chipset;
        this.socket = socket;
    }

    /**
     * Creamos un método booleano que nos devuelva si el procesador y placa base son compatibles.
     * @param microProcesador
     * @return
     */
    public boolean comprobaSocket(MicroProcesador microProcesador){
        boolean socketIguales = false;

        if(microProcesador.getSocket().equals(socket)){
            socketIguales = true;
        }else{
            socketIguales = false;
        }
        return socketIguales;
        /*Tambien podemos usar para ahorrarnos unas lineas -->
        return microProcesador.socket.equals(socket)
         */
    }

    /**
     * Creamos un método toString para pintar cada parte del componente.
     * @return
     */
    @Override
    public String toString() {
        return "PlacaBase{" +
                "nombre='" + nombre + '\'' +
                ", chipset='" + chipset + '\'' +
                ", socket='" + socket + '\'' +
                '}';
    }
}
