//Parte 3 — Geometria / Área de um círculo

import java.util.Scanner;

public class Lista01_exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuário o raio de um círculo:

System.out.print("Informe o Raio do Circulo: ");
   double raio = sc.nextDouble();

//Calculo: Utilize 3.14159 como valor de π.

double pi = 3.14159;

double area = pi * raio * raio;

//Saida:
//Como formatar o resultado (Opcional)
//System.out.printf("Área do Circulo: %.2f%n", area);
//•	printf: É o comando usado para imprimir texto formatado.
//•	%.2f: Diz ao Java para mostrar um número quebrado com apenas 2 casas decimais (ele arredonda o 12.566 para 12.57).
//•	%n: Serve para pular uma linha no final do texto.


System.out.printf("Área do Circulo: %.3f%n", area);

sc.close();

    }
}