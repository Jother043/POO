import java.util.Scanner;

public class Rectangulo {

    public int longitud;
    public int anchura;

    public int getLongitud() {
        return longitud;
    }

    //Constructor

    public Rectangulo(int longitud, int anchura) {
        this.setAnchura(anchura);
        this.anchura = anchura;
        this.setLongitud(longitud);
        this.longitud = longitud;
    }

    //Getters y setters.

    public void setLongitud(int longitud) {
        if(longitud > 0 && longitud <= 20){
            this.longitud = longitud;
        }
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        if(anchura > 0 && anchura <= 20){
            this.anchura = anchura;
        }
    }

    public int calcularPerimetro(){
        return this.longitud*2 + this.anchura*2;
    }


}

