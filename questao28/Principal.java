package questao28;
import java.util.Scanner;
import java.lang.Math;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();

        double distancia = Math.sqrt((x * x) + (y * y));
        System.out.printf("A distância da origem é %.2f" , distancia);
    scanner.close();
    }
}
