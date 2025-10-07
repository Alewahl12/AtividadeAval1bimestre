package ex5;

public class DemoDesign {
    public static void main(String[] args) {
        GerenciadorDeModelos gerenciador = new GerenciadorDeModelos();

        // 1. Carregar os modelos-base (protótipos) no gerenciador.
        // Estes são criados uma vez e podem ser caros de instanciar.
        Curriculo cvModelo = new Curriculo();
        cvModelo.setCorBase("Azul Marinho");
        cvModelo.setTipoFonte("Calibri");
        cvModelo.setLogotipo("N/A");
        gerenciador.adicionarModelo("CV_PADRAO", cvModelo);

        PropostaComercial propostaModelo = new PropostaComercial();
        propostaModelo.setCorBase("Cinza Grafite");
        propostaModelo.setTipoFonte("Arial");
        propostaModelo.setLogotipo("LogoEmpresa.png");
        gerenciador.adicionarModelo("PROPOSTA_PADRAO", propostaModelo);

        System.out.println("--- Modelos carregados. Iniciando criação para clientes... ---\n");

        // 2. Criar um currículo para a cliente Ana.
        // Pedimos uma CÓPIA do modelo padrão.
        Curriculo cvAna = (Curriculo) gerenciador.obterCopia("CV_PADRAO");
        // Personalizamos a CÓPIA.
        cvAna.setNomeCandidato("Ana Clara");
        cvAna.setExperiencia("5 anos como Desenvolvedora Java");
        cvAna.imprimir();

        // 3. Criar uma proposta para a empresa X.
        PropostaComercial propostaX = (PropostaComercial) gerenciador.obterCopia("PROPOSTA_PADRAO");
        // Personalizamos a CÓPIA.
        propostaX.setNomeCliente("Empresa X S.A.");
        propostaX.setDetalhesProjeto("Desenvolvimento de novo sistema de e-commerce.");
        // Podemos até personalizar o design da cópia.
        propostaX.setCorBase("Verde Esmeralda");
        propostaX.imprimir();

        // 4. Verificação importante: O modelo original de proposta não foi alterado.
        System.out.println("\n--- Verificando o modelo original... ---");
        PropostaComercial modeloOriginal = (PropostaComercial) gerenciador.obterCopia("PROPOSTA_PADRAO");
        modeloOriginal.setNomeCliente("NOME_CLIENTE_PADRAO"); // Simulando como ele estaria
        modeloOriginal.imprimir();
        System.out.println("Observe que a cor do modelo original continua 'Cinza Grafite', não 'Verde Esmeralda'.");
    }
}
