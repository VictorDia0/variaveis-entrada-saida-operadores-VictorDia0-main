package questao23;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o salário: ");
            double salario = scanner.nextDouble();

            double aumento = salario * 1.25;

            System.out.printf("O novo salário é " + aumento);

    scanner.close();
    }
}
