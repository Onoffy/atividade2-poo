import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner cliente = new Scanner(System.in);

        System.out.println("Você deseja um shampoo custando R$60,00");
        System.out.print("Escolha o método de pagamento (1 - à vista | 2 - a prazo): ");

        int escolha = cliente.nextInt();

        double preco = 0;
        if (escolha == 1) {
            preco = 60.00 - (60.00 * 0.10f);
            String resultado = String.format("%.2f", preco);
            System.out.println ("O preço final foi de R$" + resultado);
        }else if (escolha == 2) {
            preco = 60.00 + (60.00 * 0.05f);
            String resultado = String.format("%.2f", preco);
            System.out.println ("O preço final foi de R$" + resultado);
        }else{
            System.out.println("Código inválido");
        }

    }
}
