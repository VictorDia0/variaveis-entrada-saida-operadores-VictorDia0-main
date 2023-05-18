package questao08;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a temperatura em Kelvin: ");
        double graus = scanner.nextDouble();

        double celsius = graus - 273.15;
        System.out.printf("A temperatura em Celsius é " + celsius);

        scanner.close();
    }
}
