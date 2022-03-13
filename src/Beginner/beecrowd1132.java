package Beginner;

import java.util.Scanner;

public class beecrowd1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int min = 0;
        int max = 0;
        int soma = 0;

        if (X < Y) {
            min = X;
            max = Y;
        } else {
            min = Y;
            max = X;
        }

        for (int i=min; i<=max; i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}

/* Múltiplos de 13
Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, inclusive ambos se for o caso.

https://www.beecrowd.com.br/judge/pt/problems/view/1132 */
