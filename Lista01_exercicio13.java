//Parte 3 — Geometria / Área e perímetro de um retângulo

import java.util.Scanner;

public class Lista01_exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Solicite ao usuário a largura e a altura de um retângulo:

    System.out.print("Informe a Largura do Retangulo: ");
       float largura = sc.nextFloat();

    System.out.print("Informe a Altura do retangulo: ");
       float altura = sc.nextFloat();

//Calculo:

    float area = (largura * altura);
    
    float perimetro = (2 * largura) + (2 * altura);

//Saida:

System.out.println("Área do Retangulo: " + area);

System.out.println("Perímetro " + perimetro);

sc.close();
      
    }
}