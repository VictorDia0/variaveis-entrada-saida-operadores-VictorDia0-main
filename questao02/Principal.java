package questao02;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            float x = scanner.nextFloat();

            System.out.println("A variavel é: " + x);
            scanner.close();
    }
}
