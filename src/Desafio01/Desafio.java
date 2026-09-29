package Desafio01;

public class Desafio {
    public static void main(String[] args) {

        String nomeNinja1 = "Narutinho";
        int idade1 = 13;
        String missao1 = "resgatar o gato brabo";
        String statusDaMissao1 = "em andamento";
        char nivelDaMissao1 = 'C';

        System.out.println("nomeNinja1 = " + nomeNinja1);
        System.out.println("idade1 = " + idade1);
        System.out.println("missao1 = " + missao1);
//        System.out.println("statusDaMissao1 = " + statusDaMissao1);
        System.out.println("nivelDaMissao1 = " + nivelDaMissao1);

        String nomeNinja2 = "Sasuke thola";
        int idade2 = 12;
        String missao2 = "resgatar o gato";
        String statusDaMissao2 = "em andamento";
        char nivelDaMissao2 = 'A';

        String nomeNinja3 = "Sakura pickme";
        int idade3 = 12;
        String missao3 = "resgatar o gato fofim";
        String statusDaMissao3 = "em andamento";
        char nivelDaMissao3 = 'C';

        if (idade1 >= 15){
            statusDaMissao1 = "concluida";
//            System.out.println(statusDaMissao1);
        } else if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D') {
            statusDaMissao1 = "concluida";
//            System.out.println("Missão: " + statusDaMissao1);
        }else {
            statusDaMissao1 = "não concluida";
        }
        System.out.println("statusDaMissao1 = " + statusDaMissao1);
    }
}
