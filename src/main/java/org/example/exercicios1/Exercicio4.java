package org.example.exercicios1;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        //Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String name1 = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String name2 = scanner.nextLine();

        System.out.print("Digite a idade segunda pessoa: ");
        int age2 = scanner.nextInt();

        int ageDifference = Math.abs(age1 - age2);  //Para aparecer apenas numeros positivos

        System.out.println("A diferença de idade entre " + name1 + " e " + name2 + " é de " + ageDifference);

    }

}
