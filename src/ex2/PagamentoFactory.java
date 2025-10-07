package ex2;

public class PagamentoFactory {

    public enum MeioDePagamento {
        CARTAO_CREDITO,
        BOLETO,
        PIX
    }

    public static ProcessadorPagamento criarProcessador(MeioDePagamento meio) {
        if (meio == null) {
            throw new IllegalArgumentException("O meio de pagamento não pode ser nulo.");
        }

        switch (meio) {
            case CARTAO_CREDITO:
                return new ProcessadorCartaoCredito();
            case BOLETO:
                return new ProcessadorBoleto();
            case PIX:
                return new ProcessadorPix();
            default:

                throw new UnsupportedOperationException("Meio de pagamento não suportado: " + meio);
        }
    }
}
