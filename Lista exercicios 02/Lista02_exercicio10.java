//Nível 1 — Primeiras decisões / Comparação entre dois valores
//Leia dois números inteiros e informe qual deles é o maior.
//Caso sejam iguais, informe "Valores iguais".

import java.util.Scanner;

public class Lista02_exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //entrada

    System.out.println("Informe dois numeros inteiros: ");
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();

    //processamento

    if (n1>n2) {
        System.out.println(n1 + " é maior que " + n2);

    } else if (n2>n1) {
        System.out.println(n2 + " é maior que " + n1);

    } else {
        System.out.println(n1 + " e " + n2 + " são iguais.");

    }
    sc.close();

    }
}