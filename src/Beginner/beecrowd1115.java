package Beginner;

import java.util.Scanner;

public class beecrowd1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while(X != 0 && Y != 0) {

            if(X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if(X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if(X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            X = sc.nextInt();
            Y = sc.nextInt();

        }

        sc.close();
    }

}

/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
Para cada ponto escrever o quadrante a que ele pertence.
O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste.
Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.

https://i.imgur.com/8RT8rdR.png

https://www.beecrowd.com.br/judge/pt/problems/view/1115 */
