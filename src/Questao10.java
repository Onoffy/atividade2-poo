import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.print("informe em qual turno você estuda (M - manhã ; T - tarde ; N - noite): ");
        String turno = usuario.next();

        turno = turno.toLowerCase();
        switch (turno) {
            case "m" -> System.out.println("Bom dia!");
            case "t" -> System.out.println("Boa tarde!");
            case "n" -> System.out.println("Boa noite!");
            default -> System.out.println("Valor inválido!");
        }

    }
}
