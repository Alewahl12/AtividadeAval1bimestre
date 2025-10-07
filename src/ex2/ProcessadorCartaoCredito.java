package ex2;

public class ProcessadorCartaoCredito implements ProcessadorPagamento {

    @Override
    public String processar(double valor) {
        System.out.printf("Iniciando pagamento de R$ %.2f com Cartão de Crédito...\n", valor);

        boolean aprovado = true; // Simulação de sucesso
        if (aprovado) {
            return "Pagamento com Cartão de Crédito APROVADO.";
        } else {
            return "Pagamento com Cartão de Crédito RECUSADO.";
        }
    }
}