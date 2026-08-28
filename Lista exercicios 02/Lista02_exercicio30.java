/*30. Verificação de triângulo
Leia três valores representando os lados de um possível triângulo.

Primeiro verifique se os valores são positivos. Depois verifique se realmente podem formar um triângulo.

Caso seja válido, classifique-o como:

Equilátero; (todos oa lados são iguais)
Isósceles; (pelo menos dois lados são iguais)
Escaleno; (os 3 lados são diferentes)
 */

import java.util.Scanner;

public class Lista02_exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//INPUT

System.out.println("Informe os 3 lados do Tiangulo:");

float lado1 = sc.nextFloat();
float lado2 = sc.nextFloat();
float lado3 = sc.nextFloat();

if (lado1<=0 || lado2<=0 || lado3<=0) {
   System.out.println("ERRO: VALOR NEGATIVO OU IGUAL A ZERO");
    sc.close();
    return;


//processing

} if (lado1!=lado2 && lado2==lado3) {
   System.out.println("Triangulo Isóceles");

}else if (lado2!=lado3 && lado3==lado1) {
   System.out.println("Triangulo Isóceles");
   
}else if (lado3!=lado1 && lado1==lado2) {
   System.out.println("Triangulo Isóceles");

} else if (lado1!=lado2 && lado2!=lado3) {
    System.out.println("Triangulo Escaleno");

} else {
    System.out.println("Triangulo Equilatero");

}

sc.close();

    }

}