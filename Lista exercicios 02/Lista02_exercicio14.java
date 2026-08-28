//Nível 2 — Múltiplas decisões / Menor e maior entre três valores
//Leia três números inteiros e informe:
//o maior valor;
//o menor valor.
//Considere que os valores podem ser iguais.

import java.util.Scanner;

public class Lista02_exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos três números inteiros
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

    //processamento

    if (n1>n2 && n1>n3) {
        System.out.println(n1 + "  é o maior.");
    } else if (n2>n1 && n2>n3) {
        System.out.println(n2 + "  é o maior.");
    } else if (n3>n1 && n3>n2) {
        System.out.println(n3 + "  é o maior.");
    }


    if (n1<n2 && n1<n3) {
        System.out.println(n1 + "  é o menor.");
    } else if (n2<n1 && n2<n3) {
        System.out.println(n2 + "  é o menor.");
    } else if (n3<n1 && n3<n2) {
        System.out.print(n3 + "  é o menor.");
    } else if (n1==n2 && n2==n3) {
        System.out.println("todos os numeros são iguais.");
    }

    sc.close();
}

}
