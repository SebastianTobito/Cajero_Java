package modelo;

public class CuentasGuardadas extends Cuenta {
    private double tasaInteres;

    public CuentasGuardadas(String cuentaNumero, double balanceInicial, String pin) {
        super(cuentaNumero, balanceInicial, pin);
        this.tasaInteres = tasaInteres;
    }

    public void aplicandoIntereses(){
        double interes = getBalance()*tasaInteres;
        deposito(interes);
    }

    @Override
    public void deposito(double monto) {
        this.getBalance() += monto;
    }

    @Override
    public void retiro(double monto) {

    }
}
