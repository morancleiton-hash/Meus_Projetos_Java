//Nível 1 — Primeiras decisões / Desconto simples
//Leia o valor de uma compra. Se o valor for maior ou igual a 200, aplique 10% de desconto. 
//Caso contrário, mantenha o valor original. Mostre o valor final da compra.

import java.util.Scanner;

public class Lista02_exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    //entrada

    System.out.print("Valor da compra: ");
       float vcompra = sc.nextFloat();

    //processamento

       float vfinal;
       
    if (vcompra>=200) {
          vfinal = vcompra * 0.90f;

    } else {
        vfinal = vcompra;

    }
    //saida

    System.out.printf("Valor Final: %.2f\n " , vfinal);

    sc.close();
    }
}