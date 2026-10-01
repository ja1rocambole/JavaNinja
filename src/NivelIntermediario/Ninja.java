package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public void SharinganAtivado(){
        if (nome.contains("Uchira")){

        System.out.println("Sharingan ativou!");
        }else {
            System.out.println("Vc não é Uchira!");
        }
    }

    public String EuSouUmNinja(){
        return "Oi, eu sou um ninja!";
    }

    public int AnosParaSeTornarHokage(int idadeMinima){


        return idadeMinima - idade;
    };
}
