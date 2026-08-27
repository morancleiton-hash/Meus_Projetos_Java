// Parte 1 - VARIAVEI E OPERAÇÕES BASICAS:

import java.util.Scanner;
 public class Lista01_exercicio05 {
  public static void main(String[] args) {

//SCANNER E VARIAVEIS: 
Scanner sc = new Scanner(System.in);


//ENTRADA DE DADOS:(Solicita o numero ao usuário)
System.out.print("Digite uma Centena Positiva:");
  int numero = sc.nextInt();

//PROCESAMENTO DE DADOS:(Separa os algarismos usando / e %)
int unidade = numero % 10;
int dezena = (numero / 10) % 10;
int centena = numero / 100;
int soma = centena + dezena + unidade;

//SAIDA DE DADOS: (Mostra o Resultado)
System.out.println("Soma dos Algarismos: " + soma);

sc.close();

  }
 }