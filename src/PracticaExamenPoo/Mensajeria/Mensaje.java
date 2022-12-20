package PracticaExamenPoo.Mensajeria;

import EntradaSalida.Lectora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Mensaje {
    private String asunto;
    private String cuerpo;
    private LocalDateTime fechaEnvio;
    private Persona remitente;
    private Persona destinatario;

    public Mensaje(String asunto, String cuerpo, Persona remitente, Persona destinatario) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fechaEnvio = LocalDateTime.now();
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    /**
     * Crea un objeto de tipo mensaje.
     *
     * @param persona
     * @return
     */
    public Mensaje enviarMensaje(Persona persona) {

        String asunto = Lectora.solicitarCadena("Introduce el asunto del mensaje. ");
        String cuerpo = Lectora.solicitarCadena("Introduce el cuerpo del mensaje. ");
        LocalDate hora = LocalDate.now();
        String remitente = persona.getNombre();
        String destinatario = Lectora.solicitarCadena("Introduce el destinatario");

        return new Mensaje(asunto, cuerpo, hora, remitente, destinatario);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensaje mensaje = (Mensaje) o;
        return asunto.equals(mensaje.asunto) && cuerpo.equals(mensaje.cuerpo) && fechaEnvio.equals(mensaje.fechaEnvio) && remitente.equals(mensaje.remitente) && destinatario.equals(mensaje.destinatario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asunto, cuerpo, fechaEnvio, remitente, destinatario);
    }

    @Override
    public String toString() {
        return "Mensaje{" +
                "asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                ", fechaEnvio=" + fechaEnvio +
                ", remitente='" + remitente + '\'' +
                ", Destinatario='" + Destinatario + '\'' +
                '}';
    }
}
