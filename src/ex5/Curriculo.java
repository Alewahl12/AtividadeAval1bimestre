package ex5;

public class Curriculo extends Documento {
    private String nomeCandidato;
    private String experiencia;

    public void setNomeCandidato(String nome) { this.nomeCandidato = nome; }
    public void setExperiencia(String exp) { this.experiencia = exp; }

    @Override
    public void imprimir() {
        System.out.println("--- CURRÍCULO ---");
        System.out.println("Candidato: " + nomeCandidato);
        System.out.println("Experiência: " + experiencia);
        System.out.println("Design [Cor: " + getCorBase() + ", Fonte: " + getTipoFonte() + ", Logo: " + getLogotipo() + "]");
        System.out.println("-----------------");
    }
}
