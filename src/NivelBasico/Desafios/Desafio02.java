package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        String[] ninjas = new String[13];
        Scanner entradaNinja = new Scanner(System.in);

        Scanner entradaMenu = new Scanner(System.in);
        System.out.println("Escolha uma opçao: \n " +
                "(1) Cadastrar um ninja \n " +
                "(2) Listar todos os ninjas \n " +
                "(4) Fechar menu");

        int escolhaMenu = entradaMenu.nextInt();

        while (escolhaMenu != 4) {


            switch (escolhaMenu) {
                case 1:
                    System.out.println("Insira o nome do ninja");
                    String nomeNinja = entradaNinja.nextLine();

                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                            ninjas[i] = nomeNinja;
                            break;
                        } else {
                            continue;
                        }
                    }
                    System.out.println("Escolha uma opçao: \n " +
                            "(1) Cadastrar um ninja \n " +
                            "(2) Listar todos os ninjas \n " +
                            "(4) Fechar menu");
                    escolhaMenu = entradaMenu.nextInt();

                    break;
                case 2:
                    System.out.println("Lista de Ninjas");


                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] != null) {
                            System.out.println(ninjas[i]);
                        }

                    }

                    System.out.println("Escolha uma opçao: \n " +
                            "(1) Cadastrar um ninja \n " +
                            "(2) Listar todos os ninjas \n " +
                            "(4) Fechar menu");
                    escolhaMenu = entradaMenu.nextInt();

                    break;
                default:
                    System.out.println("VC É BURRO!");
            }
            ;
        }

        entradaMenu.close();
        entradaNinja.close();
    }
}
