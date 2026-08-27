//Parte 2 - Medias e percentagens / desconto percentual

import java.util.Scanner;

public class Lista01_exercicio10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

// solicitar ao usuário:

System.out.print("Informe o Valor do Produdo: ");
 float valor = sc. nextFloat();

System.out.print("Informe o Percentual de Desconto: ");
 float percentual = sc. nextFloat();

//Calculo:
  
   float desconto = (valor * percentual) / 100;

   float total =  ( valor - desconto);

//Saida:

System.out.println("Valor do Desconto: " + desconto);

System.out.println("Valor Final da Compra: " + total);

  sc.close();


    }
}
