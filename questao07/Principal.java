package questao07;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a temperatura em Fahrenheit: ");
        double graus = scanner.nextDouble();

        double celsius = (graus - 32) /  1.8;
        System.out.printf("A temperatura em Celsius é " + celsius);

        scanner.close();
    }
}
