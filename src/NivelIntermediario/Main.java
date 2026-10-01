package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto 333";
        Naruto.aldeia = "Akdeia da Folha";
        Naruto.idade = 17;

        Naruto.SharinganAtivado();

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchira";
        Sasuke.aldeia = "Akdeia da Folha";
        Sasuke.idade = 17;

        Sasuke.SharinganAtivado();

        String mensagem = Sasuke.EuSouUmNinja();
        System.out.println(mensagem);

        int quantoTempoFalta = Sasuke.AnosParaSeTornarHokage(40);
        System.out.println("Quantos anos faltam para se tornar hokage " + quantoTempoFalta);
    }
}
