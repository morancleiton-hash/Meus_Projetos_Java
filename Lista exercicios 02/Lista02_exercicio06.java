//Nível 1 — Primeiras decisões / Temperatura
//Leia uma temperatura em graus Celsius. Informe "Temperatura elevada" quando ela for maior que 30 graus
// e "Temperatura normal" caso contrário.

import java.util.Scanner;

public class Lista02_exercicio06 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


    //entrada

    System.out.print("Informe a temperatura(C°): ");
      float temperatura = sc.nextFloat();

    //processamento

    if (temperatura>30) {
        System.out.println("Temperatura Elevada");

    } else {
        System.out.println("Temperatura Normal");

    }

    sc.close();

    }
}