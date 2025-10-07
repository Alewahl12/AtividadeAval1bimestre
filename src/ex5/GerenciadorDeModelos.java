package ex5;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeModelos {
    private Map<String, Documento> modelos = new HashMap<>();

    public void adicionarModelo(String chave, Documento modelo) {
        modelos.put(chave, modelo);
    }

    public Documento obterCopia(String chave) {
        Documento prototipo = modelos.get(chave);

        return prototipo.clone();
    }
}