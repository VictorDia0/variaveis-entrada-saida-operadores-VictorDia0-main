package questao12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o angulo em graus: ");
        double graus = scanner.nextDouble();
            double radianos = (graus * 3.14) / 180;

        System.out.printf("O angulo em graus é %.2f", radianos);

    scanner.close();
    }
    
}
