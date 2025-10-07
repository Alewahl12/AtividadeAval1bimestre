package ex2;

public class ProcessadorBoleto implements ProcessadorPagamento {

    @Override
    public String processar(double valor) {
        System.out.printf("Iniciando pagamento de R$ %.2f com Boleto Bancário...\n", valor);
        long codigoDeBarras = System.nanoTime();
        return "Boleto gerado com sucesso! Código: " + codigoDeBarras;
    }
}
