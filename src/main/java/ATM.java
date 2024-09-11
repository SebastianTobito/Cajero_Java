import java.util.Scanner;

public class ATM {
    private Calculadora calculadora = new Calculadora();

    public void start(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println(" Bienvendio a JavaBank ATM"
                    +"\n Seleccione una operacion a realizar:"
                    +"\n 1. Relizar una transaccion"
                    +"\n 2. Usar la calculadora"
                    +"\n 0. Salir");
            int eleccion = scanner.nextInt();

            switch (eleccion){
                case 1:

                    break;
                case 2:
                    calculadora.calculadora();
                    break;
                case 0:
                    exit=true;
                    break;
                default:
                    System.out.println("Selección no válida");
            }
        }

    }
}
