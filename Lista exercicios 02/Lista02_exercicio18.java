/*18. Média de duas notas
Leia duas notas, calcule a média e informe:

Aprovado: média >= 7;
Recuperação: média >= 5 e < 7;
Reprovado: média < 5.
Antes do cálculo, verifique se ambas as notas estão entre 0 e 10. Caso alguma seja inválida, não calcule a média.
 */

import java.util.Scanner;

public class Lista02_exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//INPUT

System.out.println("Informe as duas notas:");

System.out.print("nota: ");
  float nota1 = sc.nextFloat();
  if (nota1<0 || nota1>10) {
    System.out.print("ERRRO: NOTA SOMENTE DE 0 A 10.");
sc.close();
return;
  }

System.out.print("nota: ");
     float nota2 = sc.nextFloat();
     if (nota2<0 || nota2>10) {
    System.out.print("ERRRO: NOTA SOMENTE DE 0 A 10.");
sc.close();
return;
  }




//PROCESSING

float media = (nota1 + nota2) / 2;

if (media>=7) {
    System.out.println("APROVADO");

} else if (media>=5 || media<7) {
    System.out.println("RECUPERAÇÃO");

} else {
    System.out.println("REPROVADO");

}

sc.close();

    }

}