import java.util.Scanner;

public class Lista01_exercicio28_HoraMinuto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     // 1. Entrada de dados como Texto (String) para aceitar os dois pontos
        System.out.print("Informe o numero de horas trabalhadas (ex: 15:30): ");
        String horaDigitada = sc.next();

        System.out.print("Qual o Valor da Hora Trabalhada? R$ ");
        double valorHora = sc.nextDouble();

        // 2. Quebra o texto onde tem o ":"
        // Se digitar 15:30, partes[0] vira "15" e partes[1] vira "30"
        String[] partes = horaDigitada.split(":");
        int horasInteiras = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

//OBS(EXPLICAÇÃO DA ENTADA):

//1. O que faz o Integer.parseInt(...)?

//Esse comando funciona como um tradutor mágico.
//Ele pega um texto que contém dígitos e o transforma em um número
//de verdade (um número inteiro, que no Java se chama int).

//2. Traduzindo o código para o português:

//2.1 Integer.parseInt(partes[0]); 
//O que o computador faz: Ele pega o primeiro pedaço do texto ("15"),
//joga fora as "aspas de texto" e transforma isso no número 15 de verdade. Agora o computador
//sabe que são 15 horas matemáticas e pode usar esse valor em cálculos.

//2.2 Integer.parseInt(partes[1]);
//O que o computador faz: Ele pega o segundo pedaço do texto ("30"), traduz o desenho dos caracteres
//para o número 30 real. Agora você tem o número 30 isolado para poder dividir por 60 e descobrir que
//isso equivale a meia hora (0.5).

        // 3. Converte os minutos para fração de hora (ex: 30 minutos / 60 = 0.5 horas)
        double totalHorasTrabalhadas = horasInteiras + (minutos / 60.0);

        // 4. Processamento do salário
        double salbruto = totalHorasTrabalhadas * valorHora;

        // 5. Saída
        System.out.printf("Salário Bruto R$ %.2f%n", salbruto);

        sc.close();

    }
    
}
