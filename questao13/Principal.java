package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scannner = new Scanner(System.in);

        System.out.printf("Digite o angulo em radianos: ");
            float rad = scannner.nextFloat();

            double grau = (rad * 180) / 3.14159;

        System.out.printf("O angulo em graus é %.2f", grau);

    scannner.close();
    }
    
}
