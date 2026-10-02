package NivelIntermediario;

public class Senju extends Hokage {

    public Senju(String nome, int idade, boolean vivoOuNao, String aldeia, String missoes, double altura) {
        super(nome, idade, vivoOuNao, aldeia, missoes, altura);
    }

    @Override
    public void sabedoriaHokage() {
        System.out.println("vc buscou comer cimento");
    }
}
