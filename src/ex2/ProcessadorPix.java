package ex2;

public class ProcessadorPix implements ProcessadorPagamento {

    @Override
    public String processar(double valor) {
        System.out.printf("Iniciando pagamento de R$ %.2f com PIX...\n", valor);
        String qrCode = "00020126...PIX_KEY...5303986";
        return "PIX 'Copia e Cola' gerado: " + qrCode;
    }
}
