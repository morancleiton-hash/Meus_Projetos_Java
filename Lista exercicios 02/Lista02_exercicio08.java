//Nível 1 — Primeiras decisões / Número múltiplo de 5.
//Leia um número inteiro e informe se ele é ou não múltiplo de 5.

import java.util.Scanner;

public class Lista02_exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //entrada

    System.out.print("Informe um numero Inteiro: ");
       int numero = sc.nextInt();

    //processamento

    if (numero % 5 == 0) {
        System.out.println(numero + " é multiplo de 5.");

    } else {
        System.out.println(numero + " não é Multiplo de 5.");

    }
    
sc.close();

    }
}