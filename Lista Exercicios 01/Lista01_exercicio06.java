//PARTE 1 - VARIAVEIS E OPERAÇÕES BASICAS

import java.util.Scanner;
 public class Lista01_exercicio06 {
    public static void main(String[] args) {

//SCANNER:
Scanner sc = new Scanner(System.in);


//ENTRADA DE DADOS:
System.out.print("Informe un numero (dezena):");
int numero = sc.nextInt();

//PROCESSAMENTO DOS DADOS: (CALCULO)
int unidade = numero % 10;
int dezena = numero / 10;
int numeroinvertido = (unidade * 10) + dezena;

//SAIDA DE DADOS:
System.out.println("Numero Invertido: " + numeroinvertido);

sc.close();

    }
 }