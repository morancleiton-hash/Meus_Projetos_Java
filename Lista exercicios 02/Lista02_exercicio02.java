//Nível 1 — Primeiras decisões/Maior de idade
//Leia a idade de uma pessoa e informe se ela é maior de idade (idade >= 18) ou menor de idade.

import java.util.Scanner;

public class Lista02_exercicio02 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Informe sua Idade: ");
        int idade = sc.nextInt();

    
    if (idade>=18) {
        System.out.println("vc tem " + idade + " anos, então vc é maior de idade.");

    } else {
        System.out.println("vc tem " + idade + " anos, então vc é menor de idade.");
    }    

        

    sc.close();


    }
}   