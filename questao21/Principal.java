package questao21;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.printf("Digite o valor do raio: ");
                double raio = scanner.nextDouble();
                double area = (raio * raio) * 3.1415;

            System.out.printf("A área do círculo é %.2f", area);

    scanner.close();
    }
}