/*Nível 4 — Regras de negócio com várias condições
31. Cupom de desconto
Leia o valor da compra e um cupom.

Cupons disponíveis:

"VALE10": 10% de desconto, limitado a R$ 10, válido somente para compras de pelo menos R$ 30;
"VALE20": 20% de desconto, limitado a R$ 25, válido somente para compras de pelo menos R$ 100.
Caso o cupom seja inválido, a compra permanece sem desconto.

Mostre o desconto calculado, informe quando o limite precisar ser aplicado e apresente o valor final.
*/

import java.util.Scanner;

public class Lista02_exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //INPUT

    System.out.print("valor da compra: ");
       float valorcompra = sc.nextFloat();

    System.out.print("informe o cupom de desconto: ");
       String cupom = sc.next();


    //PROCESSING
/*Cupons disponíveis:

"VALE10": 10% de desconto, limitado a R$ 10, válido somente para compras de pelo menos R$ 30;
"VALE20": 20% de desconto, limitado a R$ 25, válido somente para compras de pelo menos R$ 100.
Caso o cupom seja inválido, a compra permanece sem desconto.
Mostre o desconto calculado, informe quando o limite precisar ser aplicado e apresente o valor final.
 */

float vale10 = 0.10f;
float vale20 = 0.20f;
float desconto = 0;
float valorfinal = valorcompra;

if (cupom.equals("vale10")) {

} if (valorcompra>=30) {
 desconto = 0.1f * valorcompra;

} if (desconto>10) {
    desconto = 10; 

   

} if (cupom.equals("vale20")) {

} if (valorcompra>=100) {
 desconto = 0.2f * valorcompra;

} if (desconto>25) {
    desconto = 25; 

}

valorfinal = valorcompra - desconto;



//OUTPUT
 System.out.printf("desconto: %.2f\n " , desconto);
    System.out.printf("valor final: %.2f\n " , valorfinal);


sc.close();

    }

}
