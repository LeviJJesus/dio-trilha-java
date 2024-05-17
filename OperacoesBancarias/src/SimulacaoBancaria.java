import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean sair = true;
        // System.out.println("Digite 1 para depositar, 2 para sacar, 3 para consultar o saldo e 0 para encerrar o programa");
        // System.out.println("1. depositar");
        // System.out.println("2. sacar");
        // System.out.println("3. consultar saldo");
        // System.out.println("4. Encerrar");
        
        while (sair) {
            double valorDepositar, sacar;
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quanto você quer depositar: ");
                    valorDepositar = scanner.nextDouble();
                    saldo = valorDepositar;
                    System.out.println("Seu novo saldo é: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Quanto você quer sacar? ");
                    sacar = scanner.nextDouble();
                    if (sacar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= sacar;
                        System.out.println("Seu saldo atual é de: R$" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("O saldo atual da conta é: R$" + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    sair = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}