import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("Digite o dia de 1 a 7: ");
        int dia = usuario.nextInt();

        if (dia > 0 && dia <= 7) {
            switch (dia) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Segunda");
                case 3 -> System.out.println("Terça");
                case 4 -> System.out.println("Quarta");
                case 5 -> System.out.println("Quinta");
                case 6 -> System.out.println("Sexta");
                case 7 -> System.out.println("Sábado");
            }
        }else{
            System.out.println("Dia inválido");
        }

    }
}
