package questao11;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.printf("Digite a velocidade em m/s: ");
    double metros = scanner.nextDouble();
        double metroskm = metros * 3.6;

        System.out.printf("A velocidade em km/h é %.2f km/h", metroskm);


    scanner.close();
    }
}
