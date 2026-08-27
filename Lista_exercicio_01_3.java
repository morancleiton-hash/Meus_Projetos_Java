//Parte 1 - variaveis e operações basicas
import java.util.Scanner;
    public class Lista_exercicio_01_3 {
        public static void main(String[] args) {

            //1. CRIAÇÃO DO SCANNER E VARÁVEIS
            Scanner sc = new Scanner(System.in);
             double numero1;
             double numero2;

            //2. ENTRADA DE DADOS
            System.out.print("Digite o primeiro numero:");
            numero1 = sc.nextDouble(); 
            System.out.print("Digite o segundo numero:");
            numero2 = sc.nextDouble();
            
            //3. PROCESSAMENTO DE DADOS
            double soma = numero1 + numero2;
            double subtracao = numero1 - numero2;
            double multiplicacao = numero1 * numero2;
            double divisao = numero1 / numero2;

            //4. SAÍDA DE DADOS
            System.out.println("A soma dos dois números é: " + soma);
            System.out.println("A subtração dos dois números é: " + subtracao);
            System.out.println("A multiplicação dos dois números é: " + multiplicacao);
            System.out.println("A divisão dos dois números é: " + divisao);

            sc.close();

        }
    }