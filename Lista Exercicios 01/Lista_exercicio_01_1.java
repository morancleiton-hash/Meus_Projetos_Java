//parte 1 - variaveis e operações basicas

import java.util.Scanner;
 public class Lista_exercicio_01_1 {
    public static void main(String[] args) {

//1. CRIAÇÃO DO SCANNER E VARÁVEIS

Scanner sc = new Scanner(System.in);
  int informado;
  int antecessor;
  int sucessor;

//2. ENTRADA DE DADOS
  System.out.print("Digite um número inteiro: ");
    informado = sc.nextInt();

//3. PROCESSAMENTO DE DADOS (Calculos matemáticos puros)
    antecessor = informado - 1;
    sucessor = informado + 1;

//4. SAÍDA DE DADOS
    System.out.println("O número informado é: " + informado);
    System.out.println("O antecessor do número informado é: " + antecessor);
    System.out.println("O sucessor do número informado é: " + sucessor);

    sc.close();

    }
}