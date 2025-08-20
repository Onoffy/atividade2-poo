import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Escolha uma dessas operações (+ - * /): ");
        String op = usuario.nextLine();

        System.out.print("Digite o primeiro número: ");
        int n1 = usuario.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = usuario.nextInt();

        int resul = 0;
        switch (op) {
            case "+" -> resul = 1;
            case "-" -> resul = 2;
            case "*" -> resul = 3;
            case "/" -> {
                if (n2 == 0) {
                    System.out.println("Não é possível dividir por 0");
                    return;
                }
                resul = 4;
            }
            default -> {
                System.out.println("Operação inválida");
                return;
            }
        }

        if (resul == 1) {
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        } else if (resul == 2) {
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        } else if (resul == 3) {
            System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
        } else{
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));

        }
    }
}