package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("PROCESSO SELETIVO");
        String [] candidatos = {"A","B","C","D","E","F","G"};
            for (String candidato:candidatos){
                entrandoEmContato(candidato);
            }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
            
        } while (continuarTentando && tentativasRealizadas <3);
            if (atendeu) {
                System.out.println("CONSEGUIMOS FALAR COM O CANDIDATO "+candidato+" NA "+tentativasRealizadas+ " TENTATIVA");
            } else{
                System.out.println("NÃO CONSEGUIMOS FALAR COM O CANDIDATO "+candidato+" NUMERO MAXIMO DE TENTATIVAS "+tentativasRealizadas);
            }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;

    }

    static void imprimirSelecionados(){
        String [] candidatos = {"A","B","C","D","E","F","G"};
        System.out.println("IMPRIMINDO A LISTA DE CANDIDATOS SELECIONADOS ...");
         for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº "+ (indice+1) +" é o " + candidatos[indice]);
             
         }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"A","B","C","D","E","F","G"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + ". Solicitou este valor pela vaga de trabalho: r$ "+salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    
}