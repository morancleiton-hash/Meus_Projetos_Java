//Parte 5 — Situações cotidianas / Tempo de viagem

import java.util.Scanner;

public class Lista01_exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Entrada:

System.out.print("Qual a Distancia da Viagem(km)? ");
   double distancia = sc.nextDouble();

System.out.print("Qual a velocidade(km/h)? ");
   double velocidade = sc.nextDouble();


//Processamento1:
 
double tempo = distancia / velocidade;

//Processamento2: Adicionado por mim - mostrar o tempo dividido certinho em horas e minutos (ex: 3h 12min),
//nós podemos usar o operador de resto (%) e conversões.
 
//(Calcula o tempo total em minutos)

double totalminutos = tempo * 60;

//(Separa as horas cheias e os minutos que sobram)

int horas = (int) totalminutos / 60;

int minutos = (int) totalminutos % 60;

//Saída1:

System.out.printf("Tempo Estimado horas: %.2fh%n ", tempo);

//Saída2:

System.out.printf("Tempo Estimado Horas e Minutos: %dh %dmin%n ", horas, minutos);


sc.close();

    }
}