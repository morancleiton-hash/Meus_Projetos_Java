//Parte 5 — Situações cotidianas / Custo de uma viagem

import java.util.Scanner;

public class Lista01_exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//Entrada:

System.out.print("Qual a Distância(km)? ");
   double distancia = sc.nextDouble();

System.out.print("Qual o Consumo Medio do Veiculo(km/l)? ");
   double consmed = sc.nextDouble();

System.out.print("Qual o Preço do Litro do Combustível? ");
    double preço = sc.nextDouble();

//Processamento:

double volestimado = distancia / consmed;

double kostest = volestimado * preço;


//Saída:

System.out.printf("Combustível Nescessário para Viagem: %.3f%n",volestimado);

System.out.printf("Custo Estimado: %.3f%n", kostest);

sc.close();





    }
}