package br.edu.ifsp.list01;

import java.util.Locale;
import java.util.Scanner;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/
public class Ex06 {

    public static void main(String[] args) {
        //Leia o input
        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextDouble();
        double a = scanner.nextDouble();
        double c = scanner.nextDouble();
        double m = scanner.nextDouble();
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex06 ex = new Ex06();
        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex.compute(L, a, c, m));
    }

    String compute(double L, double a, double c, double m) {
        if (L < 0 || a < 0 || c < 0 || m <= 0) return "0 0.00";


        int numeroLatas = (int) Math.ceil(L * a / m);

        return String.format(Locale.US,"%d %.2f", numeroLatas, c * numeroLatas);
    }
}
