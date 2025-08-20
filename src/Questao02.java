import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = notas.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = notas.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = notas.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = notas.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        if (media >= 7) {
            System.out.println("Aprovado");
        }else if (media >= 5 && media < 7){
            System.out.println("Recuperação");
        }else if (media < 5){
            System.out.println("Reprovado");
        }

        System.out.println("Sua nota: " + media);
    }
}
