package modelo;

public class CuentasGuardadas extends Cuenta {
    private double tasaInteres;

    public CuentasGuardadas(String cuentaNumero, double balanceInicial) {
        super(cuentaNumero, balanceInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicandoIntereses(){
        double interes = getBalance()*tasaInteres;
        deposito(interes);
    }
}
