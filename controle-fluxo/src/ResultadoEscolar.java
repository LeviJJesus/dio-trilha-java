import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        if (nota >= 7)
        System.out.println("Aprovado!");
        else 
        System.out.println("Reprovado!");
    }
}
