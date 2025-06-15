package org.example.exercicios1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        //Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela || fórmula: área=base X altura

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retangulo é: " + area);

        scanner.close();

    }

}
