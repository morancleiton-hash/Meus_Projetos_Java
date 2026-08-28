//Nível 2 — Múltiplas decisões / Classificação de nota
//Leia uma nota de 0 a 10 e classifique:

//>= 9: Excelente;
//>= 7: Bom;
//>= 6: Suficiente;
//< 6: Insuficiente.
//Se a nota estiver fora do intervalo de 0 a 10, mostre uma mensagem de erro.

import java.util.Scanner;

public class Lista02_exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//entrada

System.out.print("Informe a Nota: ");
int nota = sc.nextInt();

//processamento

if (nota<0 || nota>10) {
    System.out.println("ERRO: Nota fora do intervalo de 0 a 10.");

} else if (nota>=9) {
    System.out.println(nota + " é Excelente.");
} else if (nota>=7) {
    System.out.println(nota + " é Bom.");
} else if (nota>=6) {
    System.out.println(nota + " é Suficiente.");
} else if (nota<6) {
    System.out.println(nota + " é Insuficiente.");

}

sc.close();

    }

}

