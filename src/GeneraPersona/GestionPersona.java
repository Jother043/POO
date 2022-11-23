package GeneraPersona;

import java.time.LocalDate;

public class GestionPersona {
    public static void main(String[] args) {

        Persona persona = new Persona("José Miguel", LocalDate.of(2000, 7, 7), 29623651, (float) 1.8, 70, 'M' );
        System.out.println(persona);
        System.out.println("Tu masa corporal es : " + persona.getIMC() );
    }
}
