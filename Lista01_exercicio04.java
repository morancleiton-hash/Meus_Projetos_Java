//Parte 01 - variavei e operações basicas:

import java.util.Scanner;
  public class Lista01_exercicio04 {
    public static void main(String[] args) {

        // SCANNER E VARIAVEIS:
        Scanner sc = new Scanner (System.in);
        int numero;
        int quadrado;
        int cubo;

    // ENTRADA DE DADOS:
    System.out.print("digite um numero inteiro:");
      numero = sc.nextInt();

      // PROCESSAMENTO DOS DADOS:
        quadrado = numero * numero;
        cubo = numero * numero * numero;

         // SAIDA DE DADOS:
System.out.println("O numero elevado ao quadrado é: " + quadrado);
System.out.println("O numero elevado ao cubo é: " + cubo);

         sc.close();

    }
  }