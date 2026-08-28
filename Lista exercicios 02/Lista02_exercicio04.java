//Nível 1 — Primeiras decisões / Pode dividir?
//Leia dois números reais. Antes de realizar a divisão do primeiro pelo segundo,
// verifique se o segundo número é diferente de zero. 
// Se for zero, apresente uma mensagem informando que a divisão não pode ser realizada.

import java.util.Scanner;

public class Lista02_exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //entrada

        System.out.println("Informe dois numeros Reais para serem dividos!");

        System.out.print("Informe o dividendo: ");
        double num1 = sc.nextDouble();

        System.out.print("Informe o divisor: ");
        double num2 = sc.nextDouble();

    //processameto

    if ( num2 == 0 ) {
System.out.println("A Divisão não pode ser realizada");

    } else {
         double resultado = num1 / num2;
         System.out.printf("Seu Resultado é:  %.2f ", resultado);

    }

    

sc.close();

    }
}