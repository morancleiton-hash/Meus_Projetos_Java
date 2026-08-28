//Parte 6 — Divisão inteira e resto da divisão / Distribuição de itens

import java.util.Scanner;

public class Lista01_exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Infome a Quantidade de Itens..........: ");
   int quantidade = sc.nextInt();

System.out.print("Informe a Quantidade de Pessoas.......: ");
   int pessoas = sc.nextInt();

//Processamento:

int qtdpessoas = quantidade / pessoas;
int resto = quantidade % pessoas;

//Saida:

System.out.println("Quantidade de Item por pessoa.........: " + qtdpessoas);
System.out.println("Quantidade de Item Restante...........: " + resto);

sc.close();


    }
}