/* Nível 3 — Condicionais combinadas e aninhadas / Empréstimo simplificado
Leia:

salário mensal;
valor solicitado de empréstimo;
quantidade de parcelas.
Nenhum valor pode ser zero ou negativo. Se os dados forem válidos, calcule o valor da parcela.

O empréstimo será aprovado somente se:

a parcela não ultrapassar 30% do salário;
o valor solicitado não ultrapassar 10 vezes o salário.
Informe o motivo da reprovação quando alguma condição não for atendida.
*/

import java.util.Scanner;

public class Lista02_exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //input

System.out.print("Salario: ");
   float salario = sc.nextFloat();
     if (salario<=0 ) {
    System.out.println("ERRO: Salario não pode ser zero ou negativo");
    sc.close();
    return;
    
} 

System.out.print("Valor do emprestimo: ");
   float vemprestimo = sc.nextFloat();
      if (vemprestimo<=0) {
    System.out.println("ERRO: Valor do emprestimo não pode ser zero ou negativo");
    sc.close();
    return;
    
} 

System.out.print("Numero de Parcelas: ");
   int numeroparcelas = sc.nextInt();
      if (numeroparcelas<=0) {
    System.out.println("ERRO: Quantidade não pode ser zero ou negativo");
    sc.close();
    return;
}

//processing
/*O empréstimo será aprovado somente se:
a parcela não ultrapassar 30% do salário;
o valor solicitado não ultrapassar 10 vezes o salário.
Informe o motivo da reprovação quando alguma condição não for atendida. */

float valorparcela = vemprestimo / numeroparcelas; 


if (valorparcela> 0.3f*salario) {
    System.out.println("Reprovado: Parcela acima de 30% do salario");

} else if (vemprestimo>10*salario) {
    System.out.println("Reprovado: Valor emprestimo ultrapassa em 10 vezes o salario");


} else  {
    System.out.println("APROVADO");

}
    sc.close();


    }
}