//Nota suficiente
//Leia a nota final de um aluno. Informe APROVADO quando a nota for maior ou igual a 6.0
// e REPROVADO caso contrário.

import java.util.Scanner;

public class Lista02_exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //entrada

        System.out.print("Nota final do Aluno: ");
          float notafinal = sc.nextFloat();

    //processamento

    if (notafinal>=6.0) {
        System.out.println("APROVADO");

    } else {
        System.out.println("REPROVADO");


    }

    sc.close();

    }
}

