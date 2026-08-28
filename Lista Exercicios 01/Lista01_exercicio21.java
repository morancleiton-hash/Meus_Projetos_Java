//Parte 4 — Conversões / Fahrenheit para Celsius

import java.util.Scanner;

public class Lista01_exercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuário uma temperatura em graus Fahrenheit.

System.out.print("Informe a Temperatura/°F: ");

  double fahrenheit = sc.nextDouble();

//Calculo de conversão Fahrenheit para Celsius: - celsius = (fahrenheit - 32) * 5 / 9 - 

  double celsius = (fahrenheit - 32) * 5 / 9;

//Saída:

System.out.print("Temperatura Celsius: " + celsius);

    sc.close();

    }
}