package questao26;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o valor total da compra: ");
            double valor = scanner.nextDouble();
            double desconto = valor * 0.90;
            double divi = valor / 3;
            double comissao_av = desconto * 0.05;
            double comissao_ap = valor * 0.05;


        System.out.println("O valor total a pagar com 10% de desconto é " + desconto);
        System.out.printf("O valor de cada parcela é %.2f \n", divi );
        System.out.println("A comissão do vendedor em compras a vista é " + comissao_av);
        System.out.println("A comissão do vendedor em compras a vista é " + comissao_ap);
    scanner.close();
    }
}
