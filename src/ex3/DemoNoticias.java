package ex3;

public class DemoNoticias {
    public static void main(String[] args) {
        // 1. Criar os Subjects (tópicos que serão observados)
        TopicoNoticias esportes = new TopicoNoticias("Esportes");
        TopicoNoticias tecnologia = new TopicoNoticias("Tecnologia");

        // 2. Criar os Observers (leitores que irão assinar)
        Leitor leitorAna = new Leitor("Ana");
        Leitor leitorBruno = new Leitor("Bruno");
        Leitor leitorCarla = new Leitor("Carla");

        // 3. Registrar os Observers nos Subjects de seu interesse
        esportes.inscrever(leitorAna);
        esportes.inscrever(leitorBruno);

        tecnologia.inscrever(leitorBruno); // Bruno se interessa por ambos os tópicos
        tecnologia.inscrever(leitorCarla);
        System.out.println("-------------------------------------------------");

        // 4. Publicar notícias nos tópicos.
        // Isso irá notificar automaticamente apenas os leitores inscritos em cada tópico.
        esportes.publicarNovaMateria("Brasil é campeão da Copa!");

        tecnologia.publicarNovaMateria("Intel anuncia novo processador de 2nm.");

        // Exemplo de cancelamento de inscrição
        System.out.println("-------------------------------------------------");
        esportes.desinscrever(leitorBruno);
        System.out.println("-------------------------------------------------");

        // Publicar novamente no tópico de esportes.
        // Agora Bruno não receberá mais esta notificação.
        esportes.publicarNovaMateria("Novo técnico é contratado pela seleção.");
    }
}
