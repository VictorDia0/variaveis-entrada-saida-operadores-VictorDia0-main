package questao24;

public class Principal {
    public static void main(String[] args){
        double premio = 780000.00;
            double ganhador1 = premio * 0.46;
            double ganhador2 = premio * 0.32;
            double ganhador3 = premio - (ganhador1 + ganhador2);

        System.out.println("O primeiro ganhador recebera: R$" + ganhador1 + "reais");
        System.out.println("O segundo ganhador recebera: R$" + ganhador2 + "reais");
        System.out.println("O terceiro ganhador recebera: R$" + ganhador3 + "reais");
    }
    
}
