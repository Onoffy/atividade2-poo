import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = usuario.nextInt();

        if (numero % 2 == 0 && numero < 0) {
            System.out.println(numero + " é par e negativo");
        }else if (numero == 0) {
            System.out.println("Zero");
        }else if (numero % 2 == 0) {
            System.out.println(numero + " é par e positivo");
        }else if (numero % 2 != 0 && numero > 0){
            System.out.println(numero + " é ímpar e positivo");
        }else{
            System.out.println(numero + " é ímpar e negativo");
        }
    }
}
