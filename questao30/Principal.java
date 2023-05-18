package questao30;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite a segunda nota: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite a terceira nota: ");
        int num3 = scanner.nextInt();
        System.out.print("Digite a quarta nota: ");
        int num4 = scanner.nextInt();

        double media = (num1 + num2 + num3 + num4) / 4;

        System.out.print("A média das notas é " + media);
        
    scanner.close();
    }
    
}
