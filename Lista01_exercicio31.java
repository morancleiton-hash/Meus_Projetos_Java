//Parte 6 — Divisão inteira e resto da divisão / Conversão de minutos


import java.util.Scanner;

public class Lista01_exercicio31 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Infome o total de Minutos: ");
   int mintotal = sc.nextInt();

//Processamento:

int hora = mintotal / 60;
int minuto = mintotal % 60;

//Saída:

System.out.println("Horas: " + hora);
System.out.println("Minutos: " + minuto);


sc.close();


    }
}