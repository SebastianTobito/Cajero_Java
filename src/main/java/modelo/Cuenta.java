package modelo;

public class Cuenta {
    private String cuentaNumero;
    private double balance;

    public Cuenta(String cuentaNumero, double balanceInicial) {
        this.cuentaNumero = cuentaNumero;
        this.balance = balanceInicial;
    }

    public String getCuentaNumero() {
        return cuentaNumero;
    }

    public double getBalance() {
        return balance;
    }

    public void deposito(double monto){
        this.balance += monto;
    }

    public void retiro(double monto) {
        if (monto > this.balance){
            System.out.println("Fondos insuficientes");
        }else{
            this.balance -=monto;
        }
    }


}
