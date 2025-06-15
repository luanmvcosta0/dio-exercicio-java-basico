package org.example.exercicios1;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        //Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela || fórmula: área=lado X lado

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();

    }

}
