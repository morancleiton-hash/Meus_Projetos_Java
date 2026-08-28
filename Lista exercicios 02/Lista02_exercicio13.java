//Nível 2 — Múltiplas decisões / Maior entre três números
//Leia três números inteiros e informe qual é o maior. 
// O programa também deve identificar o caso em que os três valores são iguais.


import java.util.Scanner;

public class Lista02_exercicio13 {
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
        System.out.print(n1 + "  é o maior.");
    } else if (n2>n1 && n2>n3) {
        System.out.print(n2 + "  é o maior.");
    } else if (n3>n1 && n3>n2) {
        System.out.print(n3 + "  é o maior.");
    } else if (n1==n2 && n2==n3) {
        System.out.print("todos os numeros são iguais.");
    }

    sc.close();
}

}
