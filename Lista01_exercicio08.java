
import java.util.Scanner;

public class Lista01_exercicio08 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

//Solicitação ao usuário de 3 notas:

System.out.print("digite a primeira nota: ");
float nota1 = sc.nextFloat();

System.out.print("digite a segunda nota: ");
float nota2 = sc.nextFloat();

System.out.print("digite a terceira noita: ");
float nota3 = sc.nextFloat();

// Calculo media ponderada:

float mp = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

// Mostrando a media ponderada:

System.out.printf("Media Ponderada:  %.2f%n", mp);

sc.close();
    }
}