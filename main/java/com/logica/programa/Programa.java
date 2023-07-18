package com.logica.programa;

import java.util.Scanner;

public class Programa {
    
    Scanner scanner = new Scanner(System.in);
    
   void exercicio1() {
    
    int num1, num2;
    int result;


    System.out.println("Bem Vindo(a) a calculadora Expert! ");

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite um segundo número: ");
        num2 = scanner.nextInt();

         result = num1 + num2;

        System.out.println("A soma entre os dois numeros é: " + result);

    }
}

void exercicio2 (){
    String nome;
    String sobrenome;

    System.out.println("Escreva seu nome:");
    nome = scanner.nextLine();
    
    System.out.println("Escreva seu sobrenome:");
    sobrenome = scanner.nextLine();

    System.out.println(" Olá + nome + sobrenome");

}

void exercicio3(){
    double reais;
    double cotacaoDolar = 4.95;
    double result;

    System.out.println("Digite o valor em reais:");
    reais = scanner.nextDouble();

    result = reais / cotacaoDolar;
    System.out.println(" Voce tem $" + result + "dolares.");
}

void exercicio4(){
    int num;

    System.out.println("Escreva um numero:");
    num = scanner.nextInt();

    System.out.println(" O sucessor do número" + num + "e:" + (num+1)+ "e o antecessor é" +(num - 1)+".");
}


