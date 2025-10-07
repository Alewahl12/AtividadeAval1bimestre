package ex2;

public class DemoPagamentos {
    public static void main(String[] args) {
        System.out.println("--- Plataforma de Pagamentos ---");

        // Simulação 1: Um cliente escolhe pagar com PIX.
        // O tipo poderia vir de um arquivo de configuração, de uma tela, etc.
        PagamentoFactory.MeioDePagamento escolha1 = PagamentoFactory.MeioDePagamento.PIX;

        // O cliente pede à fábrica para criar o processador apropriado.
        ProcessadorPagamento processador1 = PagamentoFactory.criarProcessador(escolha1);

        // O cliente usa o objeto sem saber qual é a sua classe real.
        String resultado1 = processador1.processar(150.99);
        System.out.println("Resultado: " + resultado1 + "\n");


        // Simulação 2: Outro cliente decide pagar com Boleto.
        PagamentoFactory.MeioDePagamento escolha2 = PagamentoFactory.MeioDePagamento.BOLETO;
        ProcessadorPagamento processador2 = PagamentoFactory.criarProcessador(escolha2);
        String resultado2 = processador2.processar(345.00);
        System.out.println("Resultado: " + resultado2 + "\n");


        // Simulação 3: Uma compra online paga com cartão.
        PagamentoFactory.MeioDePagamento escolha3 = PagamentoFactory.MeioDePagamento.CARTAO_CREDITO;
        ProcessadorPagamento processador3 = PagamentoFactory.criarProcessador(escolha3);
        String resultado3 = processador3.processar(89.50);
        System.out.println("Resultado: " + resultado3 + "\n");
    }
}
