//Parte 6 — Divisão inteira e resto da divisão / Conversão de dias
import java.util.Scanner;

public class Lista01_exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Informe a Quantidade de Dias: ");
   int quantidade = sc.nextInt();

//Processamento:

int semana = quantidade / 7;
int resto1 = quantidade % 7; // Dias restantes depois da divisão.



//Saida:

System.out.println("A Quantidade de Dias Informado tem:");
System.out.println("Semanas...........................: " + semana);
System.out.print("Dias..............................: " + resto1);

sc.close();

    }
}