//Parte 4 — Conversões / Celsius para Fahrenheit

import java.util.Scanner;

public class Lista01_exercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuário uma temperatura em graus Celsius.

System.out.print("Informe a Temperatura/°C: ");

  double celsius = sc.nextDouble();

//Calculo de conversão Celsius para Fahrenheit: - fahrenheit = (celsius * 9 / 5) + 32 - 

  double fahrenheit = (celsius * 1.8) + 32;

//Saída:

System.out.print("Temperatura Fahrenheit " + fahrenheit);

    sc.close();

    }
}