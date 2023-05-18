package questao20;
 import java.util.Scanner;
public class Principal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            int resultado = (3 * num + 1) + (2 * num - 1);

            System.out.printf("O resultado é %d", resultado);

            scanner.close();
    }
}
