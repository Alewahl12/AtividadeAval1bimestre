package ex4;

public class AdicionalEstatisticas extends RelatorioDecorator {

    public AdicionalEstatisticas(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerarConteudo() {

        String conteudoOriginal = super.gerarConteudo();

        String estatisticas = gerarEstatisticas();

        return conteudoOriginal + estatisticas;
    }

    private String gerarEstatisticas() {

        return "\n--- ESTATÍSTICAS ADICIONAIS ---\n" +
                "Faturamento Total: R$ 1.361,25\n" +
                "Número de Pedidos: 3\n" +
                "Ticket Médio: R$ 453,75\n" +
                "-------------------------------\n";
    }
}
