import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String numeroCuenta = "123456789";
        double balance = 1500.75;
        int contrasena = 1234;

        int[] montosTransacciones = {200, 100, -100, -50};

        balance += montosTransacciones[0];
        if(balance > 0 && contrasena == 1234){
            System.out.println("Acceso concedido");
        }

        balance++;
        String estatus = (balance <0)?"Deuda":"Credito";
        System.out.println("Estado de cuenta: "+estatus);
        System.out.println(balance);

//        autenticacionUsuario(1234);

        double balance1 = 1000.0;
        ArrayList<String> transaccionesHistorial = new ArrayList<>();

        deposito(500, balance1, transaccionesHistorial);
        retiro(100, balance1, transaccionesHistorial);

        System.out.println("Balance final: "+balance1);
        for (String transaccion: transaccionesHistorial){
            System.out.println(transaccion);
        }

        System.out.println(balance1);

        ATM atm = new ATM();
        atm.start();
    }

    public static void deposito(double monto, double balance1, ArrayList<String> transaccionesHistorial){
        balance1 += monto;
        transaccionesHistorial.add("Deposito: $"+monto);
    }

    public static boolean retiro(double monto, double balance1, ArrayList<String> transaccionesHistorial){
        if (balance1 >= monto){
            balance1 -= monto;
            transaccionesHistorial.add("Retiro: $"+monto);
            return true;
        }else {
            System.out.println("Fondos insuficientes");
            return false;
        }
    }

//    public  boolean autenticacionUsuario(String contrasenaIngresada){
//        int intentos = 0;
//        while (intentos<3){
//            String contrasena;
//            if(this.contrasena.equals(contrasenaIngresada)){
//                return true;
//            }else{
//                intentos++;
//                System.out.println("contraseña incorrecta "+intentos+" de 3");
//            }
//        }return false;
//    }
}
