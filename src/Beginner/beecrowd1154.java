package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class beecrowd1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;

        while(idade >= 0) {
            soma = soma + idade;
            cont = cont + 1;
            idade = sc.nextInt();
        }

        if(cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        }

        sc.close();
    }
}

/* Idades
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
O último dado, que não entrará nos cálculos, contém o valor de idade negativa.
Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros.
A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.
A média deve ser impressa com dois dígitos após o ponto decimal.

https://www.beecrowd.com.br/judge/pt/problems/view/1154 */
