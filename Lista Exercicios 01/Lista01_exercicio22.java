//Parte 4 — Conversões / Velocidade em metros por segundo

import java.util.Scanner;

public class Lista01_exercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuário uma velocidade em quilômetros por hora:

System.out.print("Informe a Velocidade(Km/h): ");

  double velkmh = sc.nextDouble();

//Calculo de conversão Metros por segundo:

  double velms = velkmh / 3.6;
//Saída:

System.out.print("Velocidade Km/S: " + velms);

    sc.close();

    }
}