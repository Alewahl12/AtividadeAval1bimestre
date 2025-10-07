package ex4;

public class DemoRelatorios {
    public static void main(String[] args) {
        // Cenário 1: O gestor quer apenas o relatório simples.
        System.out.println("--- GERANDO RELATÓRIO SIMPLES ---");
        Relatorio relatorioSimples = new RelatorioVendasSimples();
        System.out.println(relatorioSimples.gerarConteudo());

        // Cenário 2: O gestor quer o relatório com estatísticas.
        System.out.println("\n--- GERANDO RELATÓRIO COM ESTATÍSTICAS ---");
        // Criamos um decorador de estatísticas, passando o relatório simples para ele "embrulhar".
        Relatorio relatorioComEstatisticas = new AdicionalEstatisticas(new RelatorioVendasSimples());
        System.out.println(relatorioComEstatisticas.gerarConteudo());

        // Cenário 3: O gestor quer um relatório completo, com estatísticas e formatado para PDF.
        System.out.println("\n--- GERANDO RELATÓRIO COMPLETO PARA PDF ---");
        // Encadeamos os decoradores. A ordem importa!
        // Primeiro, adicionamos as estatísticas ao relatório simples.
        // Depois, "embrulhamos" tudo com o formato PDF.
        Relatorio relatorioCompleto = new AdicionalExportacaoPDF(
                new AdicionalEstatisticas(
                        new RelatorioVendasSimples()
                )
        );
        System.out.println(relatorioCompleto.gerarConteudo());
    }
}