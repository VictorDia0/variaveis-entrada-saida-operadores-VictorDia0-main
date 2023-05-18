package teste;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.printf("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.printf("O primeiro numero é maior do que o segundo");
        }
        else if (num1 < num2){
            System.out.printf("O segundo numero é maior do que o primeiro");
        }
        else {
            System.out.printf("São iguais");
        }

        
    
    scanner.close();
    }
}
