import java.util.Scanner;

public class Lista02_exercicio33_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT
        System.out.print("Valor da Compra: ");
        float valorcompra = sc.nextFloat();

        System.out.print("Forma de pagamento: ");
        String formapagamento = sc.next();
        
        if (!formapagamento.equals("PIX") && !formapagamento.equals("DINHEIRO") && !formapagamento.equals("CARTAO")) {
            System.out.println("ERRO: FORMA DE PAGAMENTO REJEITADA");
            sc.close();
            return;
        }

        // PROCESSING
        // Declaramos no topo para que existam até o final do código
        float taxa = 0;
        float desconto = 0;
        float valorfinal = valorcompra;

        if (formapagamento.equals("PIX")) {
            // Usar 10.0f / 100f ou simplesmente multiplicar por 0.10f
            desconto = valorcompra * 0.10f; 
            valorfinal = valorcompra - desconto;
           
        } else if (formapagamento.equals("DINHEIRO")) {
            desconto = valorcompra * 0.05f; 
            valorfinal = valorcompra - desconto;

        } else if (formapagamento.equals("CARTAO") && valorcompra > 1000) {
            taxa = valorcompra * 0.02f; 
            valorfinal = valorcompra + taxa;
        }
        // Nota: O caso do CARTAO menor ou igual a 1000 não precisa de código, 
        // pois taxa e desconto já começaram valendo 0.

        // OUTPUT (Corrigido para %.2f minúsculo)
        System.out.printf("Desconto: %.2f\n", desconto);
        System.out.printf("TAXA: %.2f\n", taxa);
        System.out.printf("VALOR FINAL: %.2f\n", valorfinal);

        sc.close();
    }
}