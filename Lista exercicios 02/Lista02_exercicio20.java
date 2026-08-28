/*
20. Tipo de combustível
Leia o tipo de combustível ("G" para gasolina ou "E" para etanol) e a quantidade de litros abastecida.

Considere:

gasolina: R$ 6,20 por litro;
etanol: R$ 4,10 por litro.
Se forem abastecidos mais de 30 litros, conceda 5% de desconto.
Informe o tipo, o valor antes do desconto, o desconto e o valor final.
Caso o tipo informado seja inválido, mostre uma mensagem de erro.
*/

import java.util.Scanner;

public class Lista02_exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//entrada

String combustivel = "";
float quantidade = 0;
float valorbruto=0, desconto=0, valorfinal=0;

System.out.print ("tipo de combustivel: ");
   combustivel = sc.next();

   System.out.print ("quantidade abastecida: ");
   quantidade = sc.nextFloat();




if (combustivel.equals("G") && quantidade <= 30) {
     valorbruto = quantidade * 6.20f;
     valorfinal = valorbruto;

} else if (combustivel.equals("G") && quantidade>30) {
    valorbruto = quantidade * 6.20f;
    desconto = valorbruto * 0.05f;
    valorfinal = valorbruto - desconto;

    }



//saida

System.out.printf("valor Abastecimento gasolina: %.2f\n " , valorbruto);
System.out.printf("Desconto: %.2f\n " , desconto);
System.out.printf("valor final: %.2f\n " , valorfinal);


sc.close();




    }
}   