public class Main {
    public static void main(String[] args) {
        try {
            int resultado = 10/0;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
    }
}
