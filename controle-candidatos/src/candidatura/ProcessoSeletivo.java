package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900);
        /*analisarCandidato(2200);
        analisarCandidato(2000);*/

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase >  salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("OFERECER CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }

    }
}
