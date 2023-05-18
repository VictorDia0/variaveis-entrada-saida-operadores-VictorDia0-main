package questao16;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.printf("Digite o comprimento em metros quadrados: ");
            double metros = scanner.nextDouble();

            double hectares = metros * 0.0001;

            System.out.printf("O comprimento em hectares é " + hectares);

    scanner.close();
    }
}
