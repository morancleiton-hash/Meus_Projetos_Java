//Parte 3 — Geometria / Área total de uma sala.

//Uma sala retangular possui uma porta, também retangular. Solicite ao usuário:
//a largura da parede;
//a altura da parede;
//a largura da porta;
//a altura da porta.
//Calcule e mostre a área da parede que poderá ser pintada, desconsiderando a área ocupada pela porta.

import java.util.Scanner;

public class Lista01_exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Solicite ao usuário:

    System.out.print("Largura da parede: ");
       double lparede = sc.nextDouble();

       System.out.print("Altura da Parede: ");
       double aparede = sc.nextDouble();

    System.out.print("Largura da Porta: ");
       double lporta = sc.nextDouble();

       System.out.print("Altura da Porta: ");
       double aporta = sc.nextDouble();

    //Calculo: Calcule e mostre a área da parede que poderá
    //ser pintada, desconsiderando a área ocupada pela porta.

    double areaparede1 = (lparede * aparede) * 2;
    double areaparede2 = (lparede * aparede) * 2;
      
      double areaporta = lporta * aporta;
        
         double areapintada = areaparede1 + areaparede2 - areaporta;

    //Saida:

    System.out.println("Área de Pintura da Parede: " + areapintada);

    sc.close();

    }
}