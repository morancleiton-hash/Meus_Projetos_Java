//Parte 5 — Situações cotidianas / Divisão de uma conta

import java.util.Scanner;

public class Lista01_exercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//entrada:

System.out.print("Qual o Valor da conta? ");
   float valor = sc.nextInt();

System.out.print("Quantas Pessoas irão Pagar? ");
   float pessoa = sc.nextInt();

//processsamento:

float valpessoa = valor / pessoa;

//saída:

System.out.printf("Valor por Pessoa: %.3f%n " , valpessoa);

sc.close();

    }
}

    

