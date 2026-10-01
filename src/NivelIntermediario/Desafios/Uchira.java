package NivelIntermediario.Desafios;

public class Uchira extends Ninja{
    String habilidadeEspecial;

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println(habilidadeEspecial);
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println(habilidadeEspecial);
    }
}
