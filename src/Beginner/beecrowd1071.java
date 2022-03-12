package Beginner;

import java.util.Scanner;

public class beecrowd1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        int min, max;
        if(X < Y) {
            min = X;
            max = Y;
        } else {
            min = Y;
            max = X;
        }

        int soma = 0;
        for(int i=min+1; i<max; i++) {
            if(i % 2 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}

/* Soma de Impares Consecutivos I
Leia 2 valores inteiros X e Y.
A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro.
Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.

https://www.beecrowd.com.br/judge/pt/problems/view/1071 */
