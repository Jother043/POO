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
        /*
        Este return nos devuelve un booleano, el cual no definimos porque lo evaluamos directamente ne el return,
        si se cumple la expresión getSocket del micro es igual a socket de placa entonces nos devuelve un true, si
        no son iguales nos devolverá un false.
         */
        return microProcesador.getSocket().equals(socket);
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
