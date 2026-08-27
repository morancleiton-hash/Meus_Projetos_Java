//Parte 5 — Situações cotidianas / Compra de combustível

//Solicite ao usuário:

//o preço do litro do combustível;
//o valor que será utilizado para abastecer.
//Calcule e mostre quantos litros de combustível poderão ser comprados.

import java.util.Scanner;

public class Lista01_exercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Preço do litro do Combustível: R$ ");
  float preçolitro = sc.nextFloat();

System.out.print("Valor que será Abastecido: R$ ");
  float valor = sc.nextFloat();

//Processamento:

  float volume = valor / preçolitro;

//Saida:

System.out.printf("Total de Combustível: %.2f Litros%n" , volume);

sc.close();

    }
}