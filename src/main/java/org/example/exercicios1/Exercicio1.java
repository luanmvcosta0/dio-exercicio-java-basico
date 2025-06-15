package org.example.exercicios1;

import java.time.Year;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        // Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        nome = nome.toUpperCase();

        System.out.print("Digite o ano que voce nasceu: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Year.now().getValue();   //Pega o ano atual do sistema.
        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + ", voce tem " + idade + " anos.");

        scanner.close();

    }

}