import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 25.0;
        System.out.println("Olá, quanto você quer sacar? ");
        double valorSolicitado = sc.nextDouble();

        if (valorSolicitado <= saldo ){
            saldo = saldo - valorSolicitado;
            System.out.println("Ótimo! seu saldo agora é de: R$" + saldo);
        } else if (valorSolicitado > saldo) {
            System.out.println("Opss, o valor solicitado é maior que o seu saldo!");
            System.out.println("Seu saldo é de: R$" + saldo);
        }

    }
}
