package questao22;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o valor do produto: ");
            double valor = scanner.nextDouble();

            double desconto = valor * 0.88;
        System.out.printf("O valor do produto com desconto é %.2f reais" , desconto);

    scanner.close();   
    }
}
