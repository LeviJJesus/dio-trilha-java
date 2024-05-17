import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.println("Agora digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();


        contar(parametroUm, parametroDois);
        

        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primerio");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i <= contagem; i++)  {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
