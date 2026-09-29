package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner caixaEntrada = new Scanner(System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Narutinho");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        int escolhaDePersonagem = caixaEntrada.nextInt();

        switch (escolhaDePersonagem){
            case 1:
                System.out.println("Sua escolha foi Narutinho");
                break;
            case 2:
                System.out.println("Sua escolha foi Sasuke");
                break;
            case 3:
                System.out.println("Sua escolha foi Sakura");
                break;
            default:
                System.out.println("Você é burro man!");
        }

        caixaEntrada.close();
    }
}
