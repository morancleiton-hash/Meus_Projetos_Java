//Parte 5 — Situações cotidianas / Conta com gorjeta:

//Solicite ao usuário:
//o valor consumido em um restaurante;
//o percentual de gorjeta.

//Calcule e mostre:
//o valor da gorjeta;
//o valor total da conta;
//o valor que cada pessoa deverá pagar, considerando que a conta será dividida igualmente entre quatro pessoas.

import java.util.Scanner;

public class Lista01_exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Entrada:
System.out.print("Qual o Valor da Conta? ");
    double valconsumo = sc.nextDouble();

System.out.print("Qual o Percentual da Gorjeta? ");
    double pergorjeta = sc.nextDouble();
 
    //Porcessamento:
//OBS:Basta colocar um .0 no número 100 e no número 4. 
//Isso avisa o Java que a divisão deve rastrear os centavos.

    double valgorjeta = (valconsumo * pergorjeta) / 100.0;
    double valtotal = valconsumo + valgorjeta;
    double valpessoa = valtotal / 4.0;

    //Saída:

System.out.printf("Valor da gorjeta: %.2f%n ",valgorjeta);
System.out.printf("Valor total: %.2f%n ",valtotal);
System.out.printf("Valor total/4persona: %.2f%n ",valpessoa);

    sc.close();

    }
  
}