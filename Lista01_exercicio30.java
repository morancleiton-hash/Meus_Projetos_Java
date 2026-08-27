//Parte 5 — Situações cotidianas / Quantidade de carne para churrasco

import java.util.Scanner;

public class Lista01_exercicio30 {
    public static void main (String[] args) {
Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Quantidade de Homens: ");
  float homem = sc.nextFloat();
  homem = homem * 400;

System.out.print("Quantidade de Mulheres: ");
  float mulher = sc.nextFloat();
  mulher = mulher * 320;

System.out.print("Quantidade de Criaças: ");
  Float criança = sc.nextFloat();
  criança = criança * 200;

//Procesamento

float totalgramas = (homem + mulher + criança) * 1000;
 ;
float totalkilo = (homem + mulher + criança) / 1000;


//Saida:

System.out.printf("Quantidade total de Carne em Gramas: %.3f%n", totalgramas);

System.out.printf("Quantidade total de Carne em Kilos: %.3f%n", totalkilo);

sc.close();




    }
}