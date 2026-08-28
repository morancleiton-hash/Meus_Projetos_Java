/* 33. Compra com forma de pagamento
Leia o valor da compra e a forma de pagamento:

"PIX";
"DINHEIRO";
"CARTAO".
Regras:

PIX: 10% de desconto;
dinheiro: 5% de desconto;
cartão: sem desconto.
Se o pagamento for em cartão e o valor for maior que R$ 1.000, acrescente uma taxa de 2%.

Mostre desconto, taxa e valor final. Formas de pagamento diferentes das três indicadas devem ser rejeitadas.
 */

import java.util.Scanner;

public class Lista02_exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//input

System.out.print("Valor da Compra: ");
   float valorcompra = sc.nextFloat();

System.out.print("Forma de pagamento: ");
   String formapagamento = sc.next();
   
if (!formapagamento.equals("PIX") && !formapagamento.equals("DINHEIRO") && !formapagamento.equals("CARTAO")) {
    System.out.println("ERRO: FORMA DE PAGAMENTO REJEITADA");
sc.close();
return;
}

//PROCESSING
/*Regras:
PIX: 10% de desconto;
dinheiro: 5% de desconto;
cartão: sem desconto.
Se o pagamento for em cartão e o valor for maior que R$ 1.000, acrescente uma taxa de 2%.

Mostre desconto, taxa e valor final. Formas de pagamento diferentes das três indicadas devem ser rejeitadas.
 */
float desconto = 0;
float acrescimo = 0;
float taxa = 0;
float valorfinal = valorcompra;

if (formapagamento.equals("PIX")) {
     taxa = 0.10f;
     desconto = taxa * valorcompra;
     valorfinal = valorcompra - desconto;
   
} else if (formapagamento.equals("DINHEIRO")) {
    taxa = 0.05f;
    desconto = taxa * valorcompra;
    valorfinal = valorcompra - desconto;

} else if (formapagamento.equals("CARTAO") && valorcompra<=1000) {
     valorfinal = valorcompra;
    
} else if (formapagamento.equals("CARTAO") && valorcompra>1000) {
     taxa = 0.02f;
     acrescimo = taxa * valorcompra;
     valorfinal = valorcompra + acrescimo;
    
}

//OUTPUT

System.out.printf("Desconto: %.2F\n " , desconto);
System.out.printf("TAXA: %.2F\n " , acrescimo);
System.out.printf("VALOR fINAL: %.2F\n " , valorfinal);

sc.close();

}
    }

