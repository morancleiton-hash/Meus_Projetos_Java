//Parte 6 — Divisão inteira e resto da divisão / Conversão de segundos

import java.util.Scanner;

public class Lista01_exercicio32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Informe a Quantidade de Segundos: ");
   int segtotal = sc.nextInt();
   
//Processamento:

int hora = segtotal / 3600;
int resto1 = segtotal % 3600;

int minuto = resto1 / 60;
int resto2 = resto1 % 60;

int segundo = resto2;

//Saida:

System.out.println("Tempo: " + hora + "h" +  ":" + minuto + "m" + ":" + segundo + "s");

sc.close();


    }
}