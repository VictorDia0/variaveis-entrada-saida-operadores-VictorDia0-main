package questao03;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.printf("Digite o primeiro numero: ");
            int x = scanner.nextInt();
            System.out.printf("Digite o segundo numero: ");
            int y = scanner.nextInt();
            System.out.printf("Digite o terceiro numero: ");
            int z = scanner.nextInt();

            System.out.println("A soma dos numeros é: " + (x + y + z));
            scanner.close();
    }
}
