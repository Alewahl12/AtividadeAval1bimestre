package ex5;

public class PropostaComercial extends Documento {
    private String nomeCliente;
    private String detalhesProjeto;

    public void setNomeCliente(String nome) { this.nomeCliente = nome; }
    public void setDetalhesProjeto(String detalhes) { this.detalhesProjeto = detalhes; }

    @Override
    public void imprimir() {
        System.out.println("--- PROPOSTA COMERCIAL ---");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Projeto: " + detalhesProjeto);
        System.out.println("Design [Cor: " + getCorBase() + ", Fonte: " + getTipoFonte() + ", Logo: " + getLogotipo() + "]");
        System.out.println("--------------------------");
    }
}