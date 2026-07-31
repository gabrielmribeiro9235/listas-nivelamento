package br.edu.ifsp.list01;

import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade. Quando
    o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas. Após a leitura,
    o programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)

    Exemplos de entrada e saída:
    | Entrada             | Saída          |
    | -------             | ------         |
    | 10 20 30 80 -1      | 35.00 3 25.00% |
    | 25 30 45 -1         | 33.33 3 0.00%  |
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi (IFSP/SCL) e Adenilso Simão (ICMC/USP)
*/
public class Ex09 {

    public static void main(String[] args) {
        //Leia o input
        Scanner scanner = new Scanner(System.in);
        String inputString = "", lido;
        do {
            lido = scanner.nextLine();
            inputString += lido + ",";
        } while (Integer.parseInt(lido) > 0);
        String[] stringValues = inputString.split(",");
        int[] input = new int[stringValues.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(stringValues[i]);
            System.out.println(input[i]);
        }
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        Ex09 ex = new Ex09();
        //Escreva o resultado da chamada do método compute() aqui
        System.out.println(ex.compute(input));
    }

    String compute(int[] input) {
        double media = 0.0, porcentagemIdosos = 0.0;
        int maioresDeIdade = 0;
        for (int idade : input) {
            if (idade < 0) break;

            media += idade;

            if (idade >= 18) maioresDeIdade++;

            if (idade > 75) porcentagemIdosos += 1;
        }
        media /= input.length - 1;
        porcentagemIdosos = porcentagemIdosos / (input.length - 1) * 100;

        return String.format(Locale.US, "%.2f %d %.2f%%", media, maioresDeIdade, porcentagemIdosos);
    }
}
