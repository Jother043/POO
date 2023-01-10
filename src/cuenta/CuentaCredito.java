package cuenta;

public class CuentaCredito extends Cuenta {


    private double credito = 100.00;
    private static final int CREDITO_INICIAL = 100;

    public CuentaCredito(double saldo, double credito) {
        super(saldo);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    /**
     * Método encargado de retirar dinero heredado de la clase cuenta, para modificarlo teniendo en cuenta que estamos
     * ahora en una CuentaCredito.
     *
     * @param cantidadRetirada
     */
    @Override
    public void reintegro(double cantidadRetirada) {
        int numReintegro = getNumReintegro();
        if (cantidadRetirada > super.getSaldo() + CREDITO_INICIAL) {
            System.out.println("No puedes retirar esa cantidad.");
        } else {
            //Si la cantidad a retirar es igual, solo te queda 100 euros de crédito, por lo que estás en números rojos
            if (super.getSaldo() <= cantidadRetirada) {
                System.out.println("estas en números rojos ");
                /*
                Si el saldo es positivo entonces se lo sumamos, ya que si entra en el if y no le sumamos lo el saldo al
                crédito no tiene en cuenta el saldo que tenía, entonces si tenemos 2 euros de saldo y quitamos 20 nos
                daria 80 cuando debería dar 82.
                 */
                if (super.getSaldo() > 0) {
                    credito += getSaldo();
                }
                //se le resta al crédito la cantidad a retirar
                credito -= cantidadRetirada;
            }
            /*
            llamamos al setSaldo de la clase padre que hemos creado y le pasamos la resta del saldo - la cantidad
            a retirar.
             */
            super.setSaldo(super.getSaldo() - cantidadRetirada);
            System.out.println(cantidadRetirada + "€ retirados.");
            numReintegro++;
        }
    }

    /**
     * Método encargado de Ingresar el dinero en la cuenta, sobreescribimos el método, pero no hace nada en esta clase,
     * solo llama al método ingresar de super.
     *
     * @param cantidadIngresar
     */
    @Override
    public void ingresar(double cantidadIngresar) {
        if (super.getSaldo() < 0) {
            credito += cantidadIngresar;
            if (credito > CREDITO_INICIAL) {
                credito = CREDITO_INICIAL;
            }
        }
        super.ingresar(cantidadIngresar);
    }

    /**
     * Método encargado de decirnos el saldo actual y el crédito que el banco ha dado.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Tu saldo y credito es :" + "\n" +
                "saldo : " + super.getSaldo() + "€ \n" +
                "credito : " + credito + "€";
    }
}
