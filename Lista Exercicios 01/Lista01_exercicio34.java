//Parte 6 — Divisão inteira e resto da divisão /  Idade aproximada em dias

import java.util.Scanner;

public class Lista01_exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Entrada:

System .out.print("Infome sua Idade em Anos Completos: ");
   int idade = sc.nextInt();
   System .out.print("Quantos meses completos Apos a Idade? ");
       int meses = sc.nextInt();
          System .out.print("Quantos Dias após os Meses Completos? ");
              int dias = sc.nextInt();

//Processamento:

   int dia = idade * 365;
   int dia1 = meses * 30;
   int dia2 = dias;

   int idadedias = dia + dia1 + dia2;
   

//Saida:

System.out.print("Sua idade Aproximada em Dias é: " + idadedias + " Dias");

sc.close();

    }
    
}