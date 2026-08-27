//FAÇA UM PROGRAMA EM JAVA QUE DADO UM VALOR EM REAIS CALCULE QUANTAS NOTAS DE 100, 10 E 2,
//SAO NECESSARIAS PARA COMPOR ESSE VALOR. POR EXEMPLO:

//VALOR: 256
//2 X 100
//5 X 10
//3 X 2

import java.util.Scanner;

public class Semana03_cxeletronico_logresto {
    public static void main(String [] args) {
Scanner sc = new Scanner(System.in);

//ENTRADA:

System.out.print("Informe o Valor do Saque: R$ ");
 int valor = sc.nextInt();

//***Variável auxiliar para controlar o quanto falta calcular***
        int resto = valor;

//Processamento:

// 2. Calcula as notas de 100
        int notas100 = resto / 100;
        resto = resto % 100; // Guarda o que sobrou após tirar as notas de 100

        // 3. Calcula as notas de 10
        int notas10 = resto / 10;
        resto = resto % 10;  // Guarda o que sobrou após tirar as notas de 10

        // 4. Calcula as notas de 2
        int notas2 = resto / 2;
        resto = resto % 2;   // Moedas ou valores que não fecham com notas de 2

//saída:

 System.out.println("\n--- Resultado do Saque ---");
        System.out.printf("Valor informado: R$ %d%n", valor);
        System.out.printf("Notas de R$ 100: %d%n", notas100);
        System.out.printf("Notas de R$ 10:  %d%n", notas10);
        System.out.printf("Notas de R$ 2:   %d%n", notas2);

        if (resto > 0) {
            System.out.printf("Sobrou R$ %d em moedas.%n", resto);

     sc.close();
     
     //ESTUDAR:
//** \n => da uma quebra de linha no texto
//** \t => tabulacao (tab)
//** %f => para mostrar um float
//** %d => para mostrar um inteiro
//** %.2f => para mostrar um float com 2 casas

    }
}