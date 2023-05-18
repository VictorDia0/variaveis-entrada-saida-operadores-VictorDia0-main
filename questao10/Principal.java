package questao10;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite a velocidade em km/h: ");
        double velocidade = scanner.nextDouble();
            double conver  = velocidade / 3.6;

            System.out.printf("A velocidade em m/s é %.2f ms", conver);


        scanner.close();
    }
}
