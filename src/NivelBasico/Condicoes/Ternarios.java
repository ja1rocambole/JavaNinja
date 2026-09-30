package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        short numeroMissoes = 13;

        String nivelNinja = (numeroMissoes >=10) ? "Ele tem mais de 10 missões" : "Ele tem menos de 10 missões";
        System.out.println(nivelNinja);
    }
}
