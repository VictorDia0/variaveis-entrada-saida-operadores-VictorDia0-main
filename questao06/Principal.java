package questao06;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a temperatura em Celsius: ");
        double graus = scanner.nextDouble();

        double fah = (graus * 1.8) + 32;
        System.out.printf("A temperatura em Fahrenheit é " + fah);

        scanner.close();
    }
    
}
