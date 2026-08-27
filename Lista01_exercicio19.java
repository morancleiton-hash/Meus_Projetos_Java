//Parte 4 — Conversões / Quilômetros para metros

import java.util.Scanner;

public class Lista01_exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuário uma distância em quilômetros:

System.out.print("Informe a Distância em Quilômetro: ");

   double quilometro = sc.nextDouble();

//Calculo:

   double metro = quilometro * 1000;
   

//Saída:

System.out.println("Distancia em Metro: " + metro);


sc.close();

    }
}