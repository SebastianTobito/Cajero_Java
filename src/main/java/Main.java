public class Main {
    public static void main(String[] args) {
        String cuentaNumero = "123456789";
        double balance = 1500.75;
        int contrasena = 1234;

        int[] montosTransacciones ={200, 100, -100, -50};

        balance += montosTransacciones[0];
        if(balance > 0 && contrasena == 1234){
            System.out.println("Acceso concedido");
        }

        balance++;
        String estatus = (balance <0)?"Deuda":"Credito";
        System.out.println("Estado de cuenta: "+estatus);
        System.out.println(balance);
    }
}
