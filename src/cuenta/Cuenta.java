package cuenta;

import java.time.temporal.ChronoUnit;

public class Cuenta {
    private double reintegro;
    private double ingreso;
    private double saldo;
    private int numReintegro;
    private int numIngreso;

    public Cuenta(double saldo) {

        this.saldo = saldo;
        this.numIngreso = 0;
        this.numReintegro = 0;
    }


    public double getSaldo() {
        return saldo;
    }

    public double getReintegro() {
        return reintegro;
    }

    public void setReintegro(double reintegro) {
        this.reintegro = reintegro;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumReintegro() {
        return numReintegro;
    }

    public void setNumReintegro(int numReintegro) {
        this.numReintegro = numReintegro;
    }

    public int getNumIngreso() {
        return numIngreso;
    }

    public void setNumIngreso(int numIngreso) {
        this.numIngreso = numIngreso;
    }

    public void reintegro(double cantidadRetirada ){

        if (reintegro > saldo ) {
            System.out.println("No puedes retirar esa cantidad.");
        } else {
            this.saldo = this.saldo - cantidadRetirada;
            System.out.println(cantidadRetirada + "€ retirados.");
            numReintegro++;
        }
    }
    public void ingresar(double cantidadIngresar){

        if (ingreso <  0) {
            System.out.println("No es posible introducir esa cantidad a la cuenta, minima 1€");
        } else {
            this.saldo = this.saldo + cantidadIngresar;
            System.out.println( cantidadIngresar + "€, ingresados");
            numIngreso++;
        }
    }
    public String consulta(){
       return this.toString();
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "reintegro=" + numReintegro +
                ", ingreso=" + numIngreso +
                ", saldo=" + saldo +
                ", numReintegro=" + numReintegro +
                ", numIngreso=" + numIngreso +
                '}';
    }
}
