package NivelBasico;

public class Array {
    public static void main(String[] args) {
        String[] ninjas = new String[3];
        ninjas[0] = "naruto";
        ninjas[1] = "sasuke";
        ninjas[2] = "sakura";

        System.out.println(ninjas[0]);

        ninjas = new String[7];

        ninjas[0] = "hashirama";
        ninjas[1] = "tobirama";
        ninjas[2] = "hiruzen";
        ninjas[3] = "minato";
        ninjas[4] = "tsunade";
        ninjas[5] = "kakashi";
        ninjas[6] = "narutinho";

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

//        int[] idade = new int[2];
//        System.out.println(idade[0]);
//
//        double[] altura = new double[1];
//        System.out.println(altura[0]);
    }
}
