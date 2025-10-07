package ex3;

public class Leitor implements Assinante {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void serNotificado(String nomeDoTopico, String tituloDaNoticia) {
        System.out.printf(">> Notificação para %s: Nova matéria no tópico [%s]: \"%s\"\n",
                this.nome, nomeDoTopico, tituloDaNoticia);
    }
}