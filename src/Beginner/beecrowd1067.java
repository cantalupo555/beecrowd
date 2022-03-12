package Beginner;

import java.util.Scanner;

public class beecrowd1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        for(int i=1; i<=X ; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

/* Números Ímpares
Leia um valor inteiro X (1 <= X <= 1000).
Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

https://www.beecrowd.com.br/judge/pt/problems/view/1067 */
