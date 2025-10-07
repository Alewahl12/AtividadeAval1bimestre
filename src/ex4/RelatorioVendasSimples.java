package ex4;

public class RelatorioVendasSimples implements Relatorio {

    @Override
    public String gerarConteudo() {
        StringBuilder sb = new StringBuilder();
        sb.append("========================================\n");
        sb.append("      RELATÓRIO DE VENDAS SIMPLES\n");
        sb.append("========================================\n");
        sb.append("Pedido #001 | Cliente: João Silva   | Valor: R$ 350,00\n");
        sb.append("Pedido #002 | Cliente: Maria Souza  | Valor: R$ 120,50\n");
        sb.append("Pedido #003 | Cliente: Carlos Lima  | Valor: R$ 890,75\n");
        sb.append("========================================\n");
        return sb.toString();
    }
}