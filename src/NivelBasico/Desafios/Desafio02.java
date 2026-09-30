package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[10];
        int opçao = 0;

        while (opçao != 3){
            System.out.println("MENU NINJA");
            System.out.println("1. Cadastrar ninja");
            System.out.println("2. Listar ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção:");

            opçao = scanner.nextInt();
            scanner.nextLine();

            switch (opçao){
                case 1:
                    System.out.println("Cadastro");

                    String nomeNinja = scanner.nextLine();



                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null){
                            ninjas[i]= nomeNinja;
                            break;
                        };
                    }

                    break;
                case 2:
                    System.out.println("Listagem");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Saida");
                    break;
                default:
                    System.out.println("VC É BURRO!");
                    break;
            }

        }
    }
}
