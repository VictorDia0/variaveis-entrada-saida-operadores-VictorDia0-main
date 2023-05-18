package questao32;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cotação do dólar: ");
        double dolar = scanner.nextDouble();
        System.out.print("Digite o valor em real: ");
        int real = scanner.nextInt();

        double conversao = real / dolar;

        System.out.printf("O valor em dólar é %.2f" , conversao);
    scanner.close();
    }
}
