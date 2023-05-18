package questao29;
import java.util.Scanner;

public class Princiapl {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int res = num1 / num2;
        System.out.println("O resultado da divisão é " + res);

        int resto = num1 % num2;
        System.out.print("O resto da divisão é " + resto);

    scanner.close();
    }
}
