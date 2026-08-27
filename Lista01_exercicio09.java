//Parte 2 - Medias e percentagens / acrescimo percentual

import java.util.Scanner;

public class Lista01_exercicio09 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

// solicitar ao usuário:

System.out.print("Informe o valor do protudo: ");
 float valor = sc. nextFloat();

System.out.print("Informe o percentual de acrescimo: ");
 float percentual = sc. nextFloat();

//Calculo:
  
   float acrescimo = (valor * percentual) / 100;

   float total =  ( valor + acrescimo);

//Saida:

System.out.println("Acrescimo: " + acrescimo);

System.out.println("Valor total: " + total);

  sc.close();


    }
}
