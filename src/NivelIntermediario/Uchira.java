package NivelIntermediario;

public class Uchira extends Ninja {
    public void SharinganAtivado(){
        if (nome.contains("Uchira")){

            System.out.println("Sharingan ativou!");
        }else {
            System.out.println("Vc não é Uchira!");
        }
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.println("Eu sou " + nome + " e meu ataque é do tipo fogo");
    }
}

