package questao14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o comprimento em polegadas: ");
            double polegadas = scanner.nextDouble();

            double centimetros = polegadas * 2.54;
            System.out.printf("O comprimento em centímetros é %.1f", centimetros);

    scanner.close();
    }
}
