//FAÇA UM PROGRAMA EM JAVA QUE DADO UM VALOR EM REAIS CALCULE QUANTAS NOTAS DE 100, 10 E 2,
//SAO NECESSARIAS PARA COMPOR ESSE VALOR. POR EXEMPLO:

//VALOR: 256
//2 X 100
//5 X 10
//3 X 2


import java.util.Scanner;

public class Semana03_cxeletronico_logmatbasica {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
//ENTRADA:
        // 1. Entrada de dados
        System.out.print("Digite o valor em Reais (R$): ");
        int valorTotal = sc.nextInt();

    //***Variável auxiliar para controlar o quanto falta calcular***

        int resto = valorTotal;

//PROCESSAMENTO:

        // 2. Lógica para Notas de 100
        int notas100 = resto / 100; 
        resto = resto - (notas100 * 100); // Subtrai o valor que já foi pago em notas de 100

        // 3. Lógica para Notas de 10
        int notas10 = resto / 10;
        int valorPago10 = notas10 * 10;
        resto = resto - valorPago10;  // Subtrai o valor que já foi pago em notas de 10

        // 4. Lógica para Notas de 2
        int notas2 = resto / 2;
        int valorPago2 = notas2 * 2;
        resto = resto - valorPago2;   // Subtrai o valor que já foi pago em notas de 2

//SAIDA:
        // 5. Exibição dos resultados
        System.out.println("\n--- Resultado do Saque ---");
        System.out.printf("Valor informado: R$ %d%n", valorTotal);
        System.out.printf("Notas de R$ 100: %d%n", notas100);
        System.out.printf("Notas de R$ 10:  %d%n", notas10);
        System.out.printf("Notas de R$ 2:   %d%n", notas2);
        
        if (resto > 0) {
            System.out.printf("Sobrou R$ %d em moedas.%n", resto);

        sc.close();

        }
    }
 }