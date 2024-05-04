package candidatura;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        List<String> selecionados = selecaoDeCandidatos();
        imprimirSelecionados(selecionados);
    }

    static void imprimirSelecionados(List<String> selecionados){
        System.out.println("Imprimindo candidatos Selecionados.");
        int i = 1;
        for(String selecionado : selecionados){
            System.out.println("O candidato de nº"+i+" é "+selecionado);
            i++;
        }
    }
    static List<String> selecaoDeCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        List <String> selecionados = new ArrayList<>();
        double salarioBase =2000;

        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou o valor de: %.2f\n", candidato, salarioPretendido);

            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                selecionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        return selecionados;

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

}
