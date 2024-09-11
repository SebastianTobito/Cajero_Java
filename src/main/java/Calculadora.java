import java.util.Scanner;

public class Calculadora {

    Scanner scanner = new Scanner(System.in);

    public void calculadora(){
        System.out.println("Ingresa el primer numero");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();

        System.out.println("Ingresa el simbolo de la operación que desee ejecutar (+ - * /)");
        scanner.nextLine();
        String operacion = scanner.nextLine();

        double resultado;
        switch (operacion){
            case "+":
                resultado = suma(num1,num2);
                System.out.println(resultado);
                break;
            case "-":
                resultado = resta(num1,num2);
                System.out.println(resultado);
                break;
            case "*":
                resultado = multiplicacion(num1,num2);
                System.out.println(resultado);
                break;
            case "/":
                resultado = division(num1,num2);
                System.out.println(resultado);
                break;
        }
    }

    public double suma(double a, double b){
        return a+b;

    }
    public double resta(double a, double b){
        return a-b;
    }
    public double multiplicacion(double a, double b){
        return a*b;
    }
    public double division(double a, double b){
        if (b !=0){
            return a/b;
        }else{
            throw new ArithmeticException("No se puede dividir por 0");
        }
    }
}
