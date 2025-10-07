package ex3;

import java.util.ArrayList;
import java.util.List;

public class TopicoNoticias {
    private String nomeDoTopico;
    private List<Assinante> assinantes = new ArrayList<>();

    public TopicoNoticias(String nome) {
        this.nomeDoTopico = nome;
    }

    public void inscrever(Assinante assinante) {
        assinantes.add(assinante);
        System.out.printf("-> %s se inscreveu no tópico '%s'.\n", ((Leitor) assinante).getNome(), this.nomeDoTopico);
    }

    public void desinscrever(Assinante assinante) {
        assinantes.remove(assinante);
        System.out.printf("-> %s cancelou a inscrição do tópico '%s'.\n", ((Leitor) assinante).getNome(), this.nomeDoTopico);
    }

    private void notificarTodos(String tituloDaNoticia) {
        for (Assinante assinante : this.assinantes) {
            assinante.serNotificado(this.nomeDoTopico, tituloDaNoticia);
        }
    }

    public void publicarNovaMateria(String titulo) {
        System.out.printf("\n*** [PUBLICAÇÃO] Tópico '%s' publicou uma nova matéria: '%s' ***\n", this.nomeDoTopico, titulo);
        this.notificarTodos(titulo);
    }
}
