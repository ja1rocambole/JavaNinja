package NivelBasico.Condicoes;

public class LacoDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println(numeroDeClones);
        }

        for (int i = 0; i < numeroDeClones; i++) {
            System.out.println("O narutinho tem " + i + " clones");
        }
    }
}
