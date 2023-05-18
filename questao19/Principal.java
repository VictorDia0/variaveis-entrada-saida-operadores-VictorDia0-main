package questao19;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um número inteiro: ");
            int x = scanner.nextInt();
            int antecessor = x - 1;
            int sucessor = x + 1;

        System.out.printf("O antecessor de %d é %d \n", x , antecessor);
        System.out.printf("O sucessor de %d é %d", x , sucessor);

    scanner.close();
    }
    
}
