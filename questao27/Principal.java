package questao27;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra maiúscula: ");
        char maiuscula = scanner.next().charAt(0);
        char minuscula = (char) ((int)maiuscula + 32);

        System.out.println("A letra minúscula é " + minuscula);

    scanner.close();
    }
}
