import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        int l1 = usuario.nextInt();

        System.out.print("Digite o segundo lado do triângulo: ");
        int l2 = usuario.nextInt();

        System.out.print("Digite o terceiro lado do triângulo: ");
        int l3 = usuario.nextInt();

        if (l2 == l3 && l1 == l3) {
            System.out.println("Equilátero (todos os lados são iguais)");
        }else if (l2 == l3 || l1 == l3 || l1 == l2){
            System.out.println("Isóceles (dois lados iguais)");
        }else{
            System.out.println("Escaleno (todos os lados são diferentes)");
        }

    }
}
