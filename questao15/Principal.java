package questao15;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.printf("Digite o comprimento em centímetros: ");
            double centimetro = scanner.nextDouble();
                
            double polegada = centimetro / 2.54;
            System.out.printf("O comprimento em polegadas é %.2f", polegada);

    scanner.close();
    }
}
