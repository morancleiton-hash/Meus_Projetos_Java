//Parte 5 — Situações cotidianas / Consumo médio de combustível

import java.util.Scanner;

public class Lista01_exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Qual a Distancia Percorrida(KM)? ");
   double km = sc.nextDouble();

System.out.print("Qual o Consumo de Combst.(L)? ");
   double combst = sc.nextDouble();

//Processamento:

double consmed = km / combst;

//Saida:

System.out.printf("Seu Consumo Médio: %.3f%n ", consmed);

sc.close();

   }
}