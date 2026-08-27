//Parte 4 — Conversões / Metros para centímetros e milímetros

import java.util.Scanner;

public class Lista01_exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuário uma medida em metros:

System.out.print("Informe a Medida em Metro: ");

   double metro = sc.nextDouble();

//Calculo:

   double centimetro = metro / 100;
   double milimetro = metro / 1000;

//Saída:

System.out.println("Medida em Centímetro: " + centimetro);

System.out.println("Medida em Milímetros: " + milimetro);

sc.close();

    }
}