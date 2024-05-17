package candidaturas;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

        // Método para gerar e simular o valor pretendido pelo candidato
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
    

        // Método para selecionar os candidatos conforme o valor salarial pretendido
        static void selecaoCandidatos() {
            String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;
            while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();
    
                System.out.println("O candidato" + candidato + " solicitou este valor de salário" + salarioPretendido);
                if(salarioBase >= salarioPretendido) {
                    System.out.println("O candidato" + candidato + " foi selecionado para a vaga");
                    candidatosSelecionados++;
                }
                candidatoAtual++;
            }
        }

            // Método para imprimir os candidatos selecionados
        static void imprimirSelecionado() {
            String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

            System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

            for(int i = 0; i < candidatos.length; i++) {
                System.out.println("O candidato de nº " + i+1 + " é " + candidatos[i]);
            }
            System.out.println("Forma abreviada de interação for each");

            for(String candidato: candidatos) {
                System.out.println("O candidato selecionado foi: " + candidato);
            }
        }

              // Método para simular ligação para o candidato
        static void analisarCandidato(double salarioPretendido){
            double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO");
            } else if (salarioBase == salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            } else {
                System.out.println("AGURADANDO RESULTADO DOS DEMAIS CANDIDATOS");
            }
        }

        
    // Método que gera um número aleatório para simular se o candidato atendeu ou não 
        static boolean atender() {
            return new Random().nextInt(3)==1;
        }
    

    // Método para entrar em contato com os candidatos selecionados
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while(continuarTentando && tentativasRealizadas < 3);
            if(atendeu) {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas +" tentativa");
            } else {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);
            }
    }
    
}
