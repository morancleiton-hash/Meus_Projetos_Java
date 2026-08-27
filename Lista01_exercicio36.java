//Parte 6 — Divisão inteira e resto da divisão / Decomposição de um valor em cédulas

import java.util.Scanner;

public class Lista01_exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Informe o Valor do Saque: " + " R$");
   int valor = sc.nextInt();

//Processamento:

int resto = valor;

int nota100 = resto / 100;
resto = resto % 100;

int nota50 = resto / 50;
resto = resto % 50;


int nota20 = resto / 20;
resto = resto % 20;

int nota10 = resto / 10;
resto = resto % 10;

int nota5 = resto / 5;
resto = resto % 5;

int nota2 = resto / 2;
resto = resto % 2;

int nota1 = resto;

//Saída:

System.out.println("Qtd Cedulas de 100: " + nota100);
System.out.println("Qtd Cedulas de 500: " + nota50);
System.out.println("Qtd Cedulas de 20: " + nota20);
System.out.println("Qtd Cedulas de 10: " + nota10);
System.out.println("Qtd Cedulas de 5: " + nota5);
System.out.println("Qtd Cedulas de 2: " + nota2);
System.out.println("Qtd Cedulas de 1: " + nota1);

sc.close();


    }
}