package NivelIntermediario.Desafios;

public class Main {
    static void main(String[] args) {
        Uchira Madara = new Uchira();

        Madara.nome = "Madara";
        Madara.idade = 100;
        Madara.missao = "Destruir o Mundo";
        Madara.nivelDificuldade = 'S';
        Madara.statusmissao = "Fracassou";
        Madara.habilidadeEspecial = "Susano";

        Madara.mostrarHabilidadeEspecial();
        Madara.mostrarInformacoes();
    }
}
