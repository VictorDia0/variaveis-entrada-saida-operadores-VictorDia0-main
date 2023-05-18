package questao33;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = scanner.nextInt();

        double horas = minutos / 60.0;
        System.out.printf("%d minutos é equivalente a %.2f horas", minutos,horas);
    scanner.close();
    }
}
