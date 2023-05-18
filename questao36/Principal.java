package questao36;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a duração em minutos: ");
            double minutos = scanner.nextDouble();
            double aceleracao = 20.2;
            double segundos = minutos * 60.0;
            double altura = 0.5 * aceleracao * (segundos * segundos);
        
        System.out.printf("A altura necessária para que a pedra caia em %.2f minutos é %.1f metros", minutos, altura);
        
        scanner.close();
    }
    
}
