//Nível 1 — Primeiras decisões / Senha simples
//Leia uma senha inteira. Se a senha digitada for 4321, mostre "Acesso permitido". 
// Caso contrário, mostre "Senha incorreta".

import java.util.Scanner;

public class Lista02_exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//entrada

System.out.print("Informe a Senha: ");
   int senha = sc.nextInt();

//processamento

if (senha == 4321) {
    System.out.println("Acesso Permitido");

} else {
    System.out.println("Senha Incorreta!");

}

sc.close();


    }
}