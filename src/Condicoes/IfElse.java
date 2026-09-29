package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        String nome = "Narutinho 333";
        String rank;


        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 100;

        if (numeroDeMissoes >= 10 && numeroDeMissoes < 20 && idade > 15){
            rank = "chunin";
            System.out.println(rank);
        } else if (numeroDeMissoes >= 20) {
            rank = "jounin";
            System.out.println(rank);
        }
        else {
            rank = "genin";
            System.out.println(rank);
        }

    }
}
