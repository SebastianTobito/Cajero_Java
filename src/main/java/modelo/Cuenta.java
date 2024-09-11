package modelo;

public abstract class Cuenta implements Autenticacion{
    private String cuentaNumero;
    private double balance;
    private String pin;

    public Cuenta(String cuentaNumero, double balanceInicial, String pin) {
        this.cuentaNumero = cuentaNumero;
        this.balance = balanceInicial;
        this.pin = pin;
    }

    public String getCuentaNumero() {
        return cuentaNumero;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposito(double monto){
        this.balance += monto;
    }

    public abstract void retiro(double monto) {
        if (monto > this.balance){
            System.out.println("Fondos insuficientes");
        }else{
            this.balance -=monto;
        }
    }

    @Override
    public boolean atenticacion(String pin) {
        return this.pin.equals(pin);
    }
}
