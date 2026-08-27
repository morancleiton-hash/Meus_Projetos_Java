//Parte 3 — Geometria / Área de um triângulo

import java.util.Scanner;

public class Lista01_exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuário a base e a altura de um triângulo:

System.out.print("Infome a Base do Triangulo: ");
   double base = sc.nextDouble();

System.out.print("Informe a Altura do Triangulo: ");
   double altura = sc.nextDouble();

//Calculo:

double area = (base * altura) / 2;

//Saida:

System.out.println("Área do Triangulo " + area);

sc. close();

    }
}