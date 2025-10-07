package ex5;

public abstract class Documento implements Cloneable {
    private String corBase;
    private String tipoFonte;
    private String logotipo;

    public String getCorBase() { return corBase; }
    public void setCorBase(String corBase) { this.corBase = corBase; }
    public String getTipoFonte() { return tipoFonte; }
    public void setTipoFonte(String tipoFonte) { this.tipoFonte = tipoFonte; }
    public String getLogotipo() { return logotipo; }
    public void setLogotipo(String logotipo) { this.logotipo = logotipo; }

    @Override
    public Documento clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Documento) clone;
    }

    public abstract void imprimir();
}