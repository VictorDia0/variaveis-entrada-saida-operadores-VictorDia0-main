package questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = scanner.nextInt();
        System.out.println("A variável é: " + x);

        scanner.close();
    }
}