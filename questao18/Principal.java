package questao18;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.printf("Digite o primeiro valor: ");
                int n1 = scanner.nextInt();
            System.out.printf("Digite o segundo valor: ");
                int n2 = scanner.nextInt();
            System.out.printf("Digite o terceiro valor: ");
                int n3 = scanner.nextInt();

            int soma = (n1 * n1) + (n2 * n2) + (n3 * n3);
            System.out.printf("A soma dos quadrados dos três valores é %d", soma);
            
    scanner.close();
    }
    
}
