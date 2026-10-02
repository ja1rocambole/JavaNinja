package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public String EuSouUmNinja(){
        return "Oi, eu sou um ninja!";
    }

    public int AnosParaSeTornarHokage(int idadeMinima){
        return idadeMinima - idade;
    };

    public void HabilidadeEspecial(){
        System.out.println("Eu sou " + nome + " e esse é meu ataque especial");
    }
}
