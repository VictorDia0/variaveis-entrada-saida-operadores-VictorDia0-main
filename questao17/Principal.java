package questao17;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o comprimento em hectares: ");
            int hectare = scanner.nextInt();

            int metro = hectare * 10000;
            System.out.printf("O comprimento em metros quadrados é " + metro);

    scanner.close();
    }
    
}
