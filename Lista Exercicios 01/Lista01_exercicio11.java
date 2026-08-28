//Parte 2 - Medias e percentagens / comissão de venda

import java.util.Scanner;

public class Lista01_exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuario:

System.out.print("Valor Total Vendido: ");
  double valor = sc.nextDouble();

System.out.print("Percentual de Comissão: ");
  double percentual = sc.nextDouble();
  
//Calculo:

double comissão = (valor * percentual) / 100;

//Saida:

System.out.println("Valor da Comissão: " + comissão);

sc.close();
    }
}