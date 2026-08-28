//Nível 2 — Múltiplas decisões / Faixa de temperatura
//Leia uma temperatura em graus Celsius e classifique:

//abaixo de 0: Congelante;
//de 0 a 15: Frio;
//acima de 15 até 25: Agradável;
//acima de 25 até 35: Quente;
//acima de 35: Muito quente.

import java.util.Scanner;

public class Lista02_exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//input

System.out.print("Qual a temperatura? ");
float valor = sc.nextFloat();

//processing

if (valor<0) {
    System.out.println("Congelante");

} else if (valor<=15) {
    System.out.println("Frio");

} else if (valor<=25) {
    System.out.println("Agradável");
    
} else if (valor<=35) {
    System.out.println("Quente");
    
} else if (valor>35) {
    System.out.println("Muito quente");
    
} 

sc.close();

    }

}