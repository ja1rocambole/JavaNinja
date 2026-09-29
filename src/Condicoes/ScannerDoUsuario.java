package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Insira o nome:");
        String nome = caixaDeTexto.nextLine();
        System.out.println("O nome é: " + nome);

        Scanner caixaIdade = new Scanner((System.in));

        System.out.println("Insira a idade");
        int idade = caixaIdade.nextInt();
        System.out.println("Sua idade é: " + idade);

        caixaDeTexto.close();
        caixaIdade.close();
    }
}
