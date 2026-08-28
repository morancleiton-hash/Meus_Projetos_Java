//Nível 1 — Primeiras decisões / Par ou ímpar.
//Leia um número inteiro e informe se ele é par ou ímpar.

import java.util.Scanner;

public class Lista02_exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        float numero = sc.nextFloat();

// Se o resto da divisão por 2 for igual a zero, é PAR

    if (numero % 2 == 0) {
        System.out.println("o numero " + numero + " é par");

    } else {
        System.out.println("o numero " + numero + " é impar");

        sc.close();

    }
    }
}