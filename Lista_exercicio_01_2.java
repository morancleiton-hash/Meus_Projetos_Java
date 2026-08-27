//Parte 1 - variaveis e operações basicas_dobro, triplo e metade

import java.util.Scanner;
  public class Lista_exercicio_01_2 {
    public static void main(String[] args) {

//1. CRIAÇÃO DO SCANNER E VARÁVEIS
Scanner sc = new Scanner(System.in);
  double informado;
  double dobro;
  double triplo;
  double metade;

//2. ENTRADA DE DADOS
System.out.print("Informe o numero que vc quiser: ");
   informado = sc.nextDouble();

//3. PROCESSAMENTO DE DADOS
    dobro = informado * 2;
    triplo = informado * 3;
    metade = informado / 2;

//4. SAÍDA DE DADOS
    System.out.println("O número informado é: " + informado);
    System.out.println("O dobro do número informado é: " + dobro);
    System.out.println("O triplo do número informado é: " + triplo);
    System.out.println("A metade do número informado é: " + metade);

    sc.close();

    }
}
