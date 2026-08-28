//Parte 5 — Situações cotidianas / Salário por horas trabalhadas

import java.util.Scanner;

public class Lista01_exercicio28 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


//Entrada:

System.out.print("Informe a Quantidade de horas trabalhadas: ");
   double htrabalhadas = sc.nextDouble();

System.out.print("Qual o Valor da Hora Trabalhada? R$ ");
   double valorhora = sc.nextDouble();

//Processamento:

double salbruto = htrabalhadas * valorhora;

//Saída:

System.out.printf("Salário Bruto: R$ %.2f%n ",salbruto);

sc.close();

        
    }
}
