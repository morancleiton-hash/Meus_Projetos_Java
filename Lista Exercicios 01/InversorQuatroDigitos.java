//FAÇA UM INVERSOR DE 4 DIGITOS
//1234 -> 4321
//UTILIZANDO OPERACOES 

import java.util.Scanner;

public class InversorQuatroDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero de 4 digitos: ");
        int numeroOriginal = sc.nextInt();
        
// Vamos usar uma variavel auxiliar para nao perder o numero original
        int numero = numeroOriginal; 
        
// 1. Isolar o quarto digito (unidade)
        int quartoDigito = numero % 10; // Ex: 1234 % 10 = 4
        numero = numero / 10;           // Ex: 1234 / 10 = 123
        
// 2. Isolar o terceiro digito (dezena)
        int terceiroDigito = numero % 10; // Ex: 123 % 10 = 3
        numero = numero / 10;             // Ex: 123 / 10 = 12
        
// 3. Isolar o segundo digito (centena)
        int segundoDigito = numero % 10;  // Ex: 12 % 10 = 2
        numero = numero / 10;              // Ex: 12 / 10 = 1
        
// 4. O que sobrou é o primeiro digito (milhar)
        int primeiroDigito = numero;       // Ex: 1
        
// 5. Montar o numero invertido matematicamente
// O 4 vira milhar (x1000), o 3 vira centena (x100), o 2 dezena (x10)
//e o 1 unidade (x1).
 
int numeroInvertido = (quartoDigito * 1000) + (terceiroDigito * 100) + (segundoDigito * 10) + primeiroDigito;
        
        // Exibir o resultado
        System.out.println("Numero original: " + numeroOriginal);
        System.out.println("Numero invertido: " + numeroInvertido);
        
        sc.close();
    }
}