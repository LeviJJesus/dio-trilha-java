import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scnaner;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nome, agencia;
        int usuario;
        double saldo;

        System.out.println("Olá, digite seu nome completo por favor: ");
        nome = sc.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = sc.next();

        System.out.println("Digite seu número de usuário: ");
        usuario = sc.nextInt();

        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + usuario  + " e seu saldo " + saldo + " ja está disponível para saque.");
    }
}
