//Nível 2 — Múltiplas decisões / Desconto por faixa de compra
//Leia o valor de uma compra e aplique:

//abaixo de R$ 100,00: sem desconto;
//de R$ 100,00 até R$ 299,99: 5%;
//de R$ 300,00 até R$ 499,99: 10%;
//R$ 500,00 ou mais: 15%.
//Mostre o percentual aplicado, o valor do desconto e o valor final.

import java.util.Scanner;

public class Lista02_exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//input

System.out.print("Valor da Compra: ");
float valor = sc.nextFloat();

//processing

float percentual = 0.0f;
  float valorfinal = 0.0f;
     float desconto = 0.0f;

if (valor<100) {
    valorfinal = valor;

} else if (valor<300) {
    percentual = 0.05f;
      desconto = valor * percentual;
        valorfinal = valor - desconto;

} else if (valor<500) {
    percentual = 0.1f;
      desconto = valor * percentual;
        valorfinal = valor - desconto;

} else if (valor>=500) {
    percentual = 0.15f;
      desconto = valor * percentual;
        valorfinal = valor - desconto;
}

//output

System.out.printf("Valor da Compra: %.2f\n " , valor);
  System.out.printf("Percentual Aplicado: %.2f%%\n " , percentual*100);
    System.out.printf("Valor do Desconto: %.2f\n " , desconto);
      System.out.printf("Valor Final da Compra: %.2f\n " , valorfinal);

sc.close();

    }

}