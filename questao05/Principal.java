package questao05;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int x = scanner.nextInt();

        int quinta = x / 5;
        System.out.println("A quinta parte de " + x + " é " + quinta);

        scanner.close();
    }
    
}
