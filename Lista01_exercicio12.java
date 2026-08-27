//Parte 2 - Medias e percentagens / reajuste salarial

import java.util.Scanner;

public class Lista01_exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //solicite ao usuario:
    System.out.print("Informe seu Salario Atual: ");
       float salario = sc.nextFloat();

    System.out.print("Informe o Percentual de Reajuste: ");
       float percentual = sc.nextFloat();


    //Calulo:

    float reajuste = (salario * percentual) / 100;

    float atualizado = (salario + reajuste);

    //Saida:

    System.out.println("Valor do Reajuste: " + reajuste);

    System.out.println("Salario Atualizado " + atualizado);

    sc.close();

    }
}

