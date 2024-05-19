import java.util.Scanner;

public class ControleSimplesDeSaque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble(); // Limite de saque diário

        while (true) { // O loop continua até o usuário digitar 0 ou atingir o limite
            double saque = scanner.nextDouble(); // Valor do saque

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);

                if (limiteDiario == 0) {
                    System.out.println("Limite diario atingido.");
                    break;
                }
            }
        }
    }
}