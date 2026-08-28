//Nível 2 — Múltiplas decisões / Positivo, negativo e paridade
//A partir deste ponto, cada exercício exige mais de uma decisão lógica.

//Leia um número inteiro. Primeiro informe se ele é positivo, negativo ou zero.
//Depois, caso seja diferente de zero, informe também se ele é par ou ímpar.

import java.util.Scanner;

public class Lista02_exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //entrada

    System.out.print("Informe un Numero Inteiro: ");
       int numero = sc.nextInt();

    //processamento

    if(numero>0 && numero % 2 == 0) {
        System.out.println(numero  + " é positivo e par.");

    } else if(numero>0 && numero % 2 != 0) {
        System.out.println(numero  + " é positivo e impar.");

    } else if(numero<0 && numero % 2 == 0){
        System.out.println(numero  + " é negativo e par.");

    } else if(numero<0 && numero % 2 != 0) {
        System.out.println(numero  + " é negativo e impar.");

    } else {
        System.out.println(numero  + " não há classificação");
    }
    sc.close();

    }
}