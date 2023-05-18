package questao25;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário-base: ");
        double salario = scanner.nextDouble();

        double gratificacao = salario * 1.05;
        double imposto = salario * 0.07;
        double salarioLiquido = gratificacao - imposto;

        System.out.printf("O salário a receber é %.2f", salarioLiquido);

        scanner.close();
    
    }
}
