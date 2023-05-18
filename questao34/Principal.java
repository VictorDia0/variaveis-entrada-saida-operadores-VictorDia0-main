package questao34;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas: ");
        int horas = scanner.nextInt();

        int segundos = horas * 3600;
        System.out.printf("%d hora(s) é equivalente a %d segundos", horas,segundos);
    scanner.close();
    }
}
