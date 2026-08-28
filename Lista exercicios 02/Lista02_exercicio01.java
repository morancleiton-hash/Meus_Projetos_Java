//Nível 1 — Primeiras decisões/ 1. Positivo ou negativo
//Leia um número inteiro e informe se ele é positivo ou negativo. Considere o zero como positivo.

import java.util.Scanner;

public class Lista02_exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Informe un Numero Inteiro: ");
            int numero = sc.nextInt();
            
    if (numero >= 0) {
        System.out.println(numero + " é Positivo");

          } else {
            System.out.println(numero + " é Negativo");

          }

          sc.close();
    }


}

