import java.util.Scanner;

public class verificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // System.out.println("Digite o número da conta bancária: ");
            String numeroConta = scanner.nextLine();
            // System.out.println(numeroConta.length());
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");

            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException{
        if(numeroConta.length() != 8) {
            throw new IllegalArgumentException();
        }
    }
}
