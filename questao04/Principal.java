package questao04;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        float x = scanner.nextFloat();
        float resultado = x * x;

        System.out.println("O quadrado de" + x + " é: " + resultado);
        scanner.close();
        
    }
}
