/*Nível 3 — Condicionais combinadas e aninhadas
22. Frete por região e valor da compra
Leia o valor da compra e a região de entrega:

"S" — Sul;
"SE" — Sudeste;
"CO" — Centro-Oeste.

Fretes:
Sul: R$ 20;
Sudeste: R$ 30;
Centro-Oeste: R$ 40.
Se a compra for igual ou superior a R$ 500, o frete será grátis, independentemente da região. 
Caso a região seja inválida, informe erro. Mostre o valor da compra, frete e total final.
*/

import java.util.Scanner;

public class Lista02_exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//input



System.out.print("Valor da compra: ");
  float valorcompra = sc.nextFloat();

System.out.print("Região de entrega: ");
  String regiao = sc.next();
  
if (!regiao.equals("S") && !regiao.equals("SE") && !regiao.equals("CO")) {
   System.out.print("ERRO: Regiao invalida");
   sc.close();
   return;
}

//processing

/*
fretes:
Sul: R$ 20;
Sudeste: R$ 30;
Centro-Oeste: R$ 40.
Se a compra for igual ou superior a R$ 500, o frete será grátis, independentemente da região. 
Caso a região seja inválida, informe erro. Mostre o valor da compra, frete e total final.
 */

float fretesul = 20;
float fretesudeste = 30;
float fretecentroeste = 40;

float valorfinalsul = valorcompra + fretesul;
float valorfinalsudeste = valorcompra + fretesudeste;
float valorfinalcentroeste = valorcompra + fretecentroeste;


if (regiao.equals("S") && valorcompra<500){
    System.out.printf("Valor da compra: %.2f\n " , valorcompra);
       System.out.printf("frete: %.2f\n " , fretesul);
          System.out.printf("Valor da final: %.2f\n " , valorfinalsul);

} else if  (regiao.equals("SE") && valorcompra<500){
    System.out.printf("Valor da compra: %.2f\n " , valorcompra);
       System.out.printf("frete: %.2f\n " , fretesudeste);
          System.out.printf("Valor da final: %.2f\n " , valorfinalsudeste);

} else if  (regiao.equals("CO") && valorcompra<500){
    System.out.printf("Valor da compra: %.2f\n " , valorcompra);
       System.out.printf("frete: %.2f\n " , fretecentroeste);
          System.out.printf("Valor da final: %.2f\n " , valorfinalcentroeste);

} else {
    System.out.println("Frete Gratis");
        System.out.printf("Valor da final: %.2f\n " , valorcompra);
} 

sc.close();
 }

}

