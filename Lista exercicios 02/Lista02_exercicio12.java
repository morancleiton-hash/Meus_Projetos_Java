//Nível 2 — Múltiplas decisões / Classificação por idade
//Leia a idade de uma pessoa e classifique-a como:

//Criança: de 0 a 11 anos;
//Adolescente: de 12 a 17 anos;
//Adulto: de 18 a 59 anos;
//Idoso: 60 anos ou mais.
//Caso a idade seja negativa, informe que o valor é inválido.

import java.util.Scanner;

public class Lista02_exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //entrada

    System.out.print("Informe a Idade: ");
       int idade = sc.nextInt();

    //processamento

    if (idade < 0){
        System.out.println(idade + " Valor Invalido.");

    }else if (idade<=11) {
        System.out.println(idade + " anos é Criança.");

    } else if (idade<=17) {
        System.out.println(idade + " anos é Adolescente.");

    } else if (idade<=59) {
        System.out.println(idade + " anos é Adulto.");

    } else if (idade>=60) {
        System.out.println(idade + " anos é Idoso.");

} 

sc.close();

    }

}