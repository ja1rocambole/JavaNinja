package NivelIntermediario;

public abstract class Hokage {
        String nome;
        int idade;
        boolean vivoOuNao;
        String aldeia;
        String missoes;
        double altura;

        public abstract void sabedoriaHokage();

//  Toda classe já tem um construtor sem argumentos desde que é criada
       public Hokage(){
       }
//  Mas nos podemos e devemos refazer ela com argumentos para padronizar a criação de objetos a partir da classe
//O ATALHO PARA CRIAR CONTRUCTOR É "ALT+INSER"

    public Hokage(String nome, int idade, boolean vivoOuNao, String aldeia, String missoes, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.altura = altura;
    }
}
