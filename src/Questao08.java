import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int n1 = usuario.nextInt();

        System.out.print("Digite o segundo número do intervalo: ");
        int n2 = usuario.nextInt();

        System.out.print("Digite um número: ");
        int n3 = usuario.nextInt();

        if (n3 >= n1 && n3 <= n2) {
            System.out.println("O número " + n3 + " está dentro do intervalo");
        }else{
            System.out.println("O número " + n3 + " não está dentro do intervalo");
        }

    }
}
