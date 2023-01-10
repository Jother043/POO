package cuenta;

public class CuentaCredito extends Cuenta{

    private double credito = 100.00;

    public CuentaCredito(double saldo, double credito) {
        super(saldo);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

}
