//Nível 2 — Múltiplas decisões / Menor e maior entre três valores
//Leia três números inteiros e informe:
//o maior valor;
//o menor valor.
//Considere que os valores podem ser iguais.



//*********FEITO PELA IA************\\


import java.util.Scanner;

public class Lista02_exercicio14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos três números inteiros
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        // Lógica para encontrar o maior número
        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        // Lógica para encontrar o menor número
        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        // Exibição dos resultados
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        sc.close();
    }
}