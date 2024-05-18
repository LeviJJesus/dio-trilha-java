import java.util.Scanner;

public class ControleSimplesDeSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble(); // 3000
        // double saque = 0;


        for(int i = 0; i <= 10; i++) {
            double saque = scanner.nextDouble(); // 2000
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            } else {
                double valorNovo = limiteDiario - saque;
                System.out.println("Saque realizado. Limite restante: " + valorNovo);
            }
        }
    }
}
