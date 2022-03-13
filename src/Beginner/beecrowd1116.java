package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resp = (double) num1 / num2;
                System.out.printf("%.1f%n", resp);
            }
        }

        sc.close();
    }
}

/* Dividindo X por Y
Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo.
Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N.
Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.

Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro.
Utilize cast :)

https://www.beecrowd.com.br/judge/pt/problems/view/1116 */
