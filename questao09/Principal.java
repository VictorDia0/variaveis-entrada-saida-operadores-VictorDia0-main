package questao09;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a temperatura em Celsius: ");
        double conversao = scanner.nextDouble();

            double conve = conversao + 273.15;
            System.out.printf("A temperatura em Kelvin é " + conve);
            
        scanner.close();
    }
}
