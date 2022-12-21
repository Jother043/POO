package PracticaExamenPoo.Mensajeria;

import EntradaSalida.Lectora;

import java.time.LocalDate;
import java.util.Arrays;

public class Persona {

    private final int MAX_MENSAJES = 5;
    private String nombre;
    private Mensaje[] mensajesRecibidos, mensajesEnviados;


    public Persona(String nombre, Mensaje[] buzon) {
        this.nombre = nombre;
        this.mensajesRecibidos = new Mensaje[MAX_MENSAJES];
        this.mensajesEnviados = new Mensaje[MAX_MENSAJES];
    }

    public String getNombre() {
        return nombre;
    }

    public int getMAX_MENSAJES() {
        return MAX_MENSAJES;
    }

    /**
     * Este método se encarga de crear y añadir el mensaje en el buzon del cliente
     *
     * @param mensaje
     *
     */
    public void enviarMensaje(Mensaje mensaje) throws MensajeriaException {

        boolean espacioSuficiente = false;

        if (mensaje.getAsunto() == null || mensaje.getAsunto().length() == 0) {
            throw new MensajeriaException("No hay asunto.");
        }
        if (mensaje.getCuerpo() == null || mensaje.getCuerpo().length() == 0) {
            throw new MensajeriaException("No hay cuerpo.");
        }
        if (mensaje.getDestinatario() == null || !(mensaje.getDestinatario() instanceof Persona)) {
            throw new MensajeriaException("No hay destinatario.");
        }

        //Recorreomos el array y si encontramos hueco, introducimos el mensaje en el
        for (int i = 0; i < mensaje.getDestinatario().mensajesRecibidos.length && !espacioSuficiente; i++) {

            if (mensaje.getDestinatario().mensajesRecibidos[i] == null) {
                espacioSuficiente = true;
                mensaje.getDestinatario().mensajesRecibidos[i] = mensaje;
            }

        }
        if (!espacioSuficiente) {
            throw new MensajeriaException("No hay espacio en el buzon de recibidos ");
        }
        espacioSuficiente = false;
        for (int i = 0; i < mensajesEnviados.length && !espacioSuficiente; i++) {

            if (mensajesEnviados[i] == null) {
                espacioSuficiente = true;
                mensajesEnviados[i] = mensaje;
            }
        }
        if (!espacioSuficiente) {
            mensaje.getDestinatario().borrarMensajeRecibidos(mensaje);
            throw new MensajeriaException("No hay espacio en el buzon de enviados ");
        }
    }

    public void borrarMensajeRecibidos(Mensaje mensaje) {
        for (int i = 0; i < mensajesRecibidos.length; i++) {
            if (mensaje.equals(mensajesRecibidos[i])) {
                mensajesRecibidos[i] = null;
            }
        }
    }

    public void borrarMensajeEnviados(Mensaje mensaje) {
        for (int i = 0; i < mensajesEnviados.length; i++) {
            if (mensaje.equals(mensajesEnviados[i])) {
                mensajesEnviados[i] = null;
            }
        }
    }


//    public String mostrarBuzon(Mensaje mensaje, Mensaje buzon[]) {
//        String mensajes = " ";
//        for (int i = 0; i < buzon.length; i++) {
//            mensajes = buzon[i] + " ";
//        }
//        return mensajes;
//    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", buzon=" + Arrays.toString(mensajesRecibidos) +
                '}';
    }
}
