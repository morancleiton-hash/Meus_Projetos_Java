//Parte 3 — Geometria / Comprimento de uma circunferência

import java.util.Scanner;

public class Lista01_exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Solicite ao usuário o raio de uma circunferência:

    System.out.print("Informe o Raio da Circunferencia: ");
       double raio = sc.nextDouble();

    //Calculo:

    double pi = 3.14159;
      double comprimento = 2 * pi * raio;

    //Saida:

    System.out.printf("Comprimento da Circunfeência: %.2f%n", comprimento);

    sc.close();
    
    }
}