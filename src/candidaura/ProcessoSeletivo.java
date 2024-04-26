package src.candidaura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
    }

    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE", "MARICA", "JULIA", "PAULO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candadidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados <5){
            String candidato = candidatos[candadidatoAtual];
            double salarioPretendido =  valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salario " + salarioPretendido );
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato);
                candidatosSelecionados++;
            }
            candadidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(Double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDITDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
