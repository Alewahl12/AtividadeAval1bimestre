package ex4;

public class AdicionalExportacaoPDF extends RelatorioDecorator {

    public AdicionalExportacaoPDF(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerarConteudo() {
        String conteudoOriginal = super.gerarConteudo();

        StringBuilder sb = new StringBuilder();
        sb.append("<<<<< INÍCIO DO DOCUMENTO PDF >>>>>\n");
        sb.append("Cabeçalho: Relatório de Vendas - Gerado em: " + java.time.LocalDate.now() + "\n");
        sb.append("--------------------------------------\n");
        sb.append(conteudoOriginal);
        sb.append("--------------------------------------\n");
        sb.append("Rodapé: © Minha Empresa Inc.\n");
        sb.append("<<<<< FIM DO DOCUMENTO PDF >>>>>\n");

        return sb.toString();
    }
}