package Beginner;

import java.util.Scanner;

public class beecrowd1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipoCombustivel = 0;

        while (tipoCombustivel != 4) {
            tipoCombustivel = sc.nextInt();
            while (tipoCombustivel < 1 || tipoCombustivel > 4) {
                tipoCombustivel = sc.nextInt();
            }

            if (tipoCombustivel == 1) {
                alcool = alcool + 1;
            } else if (tipoCombustivel == 2) {
                gasolina = gasolina + 1;
            } else if (tipoCombustivel == 3) {
                diesel = diesel + 1;
            }

            /* switch (tipoCombustivel) {
				case 1: alcool++; break;
				case 2: gasolina++; break;
				case 3: diesel++; break;
			} */
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).
O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

 https://www.beecrowd.com.br/judge/pt/problems/view/1134 */