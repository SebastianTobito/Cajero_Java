package modelo;

public class VerificandoCuentas  extends Cuenta{

    public VerificandoCuentas(String cuentaNumero, double balanceInicial, String pin) {
        super(cuentaNumero, balanceInicial, pin);
    }

    @Override
    public void deposito(double monto) {
       getBalance()+=monto;
    }

    @Override
    public void retiro(double monto) {
        if (monto>getBalance()){
            System.out.println("Saldo insuficiente");
        }else {
            getBalance() -= monto;
        }
    }

}

