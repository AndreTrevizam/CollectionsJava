package Exercicio.Map.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    private Map<String, Integer> contarPalavrasMap;

    //construtor
    public ContagemPalavras() {
        this.contarPalavrasMap = new HashMap<>();
    }

    //metodos
    public void adicionarPalavra(String palavra, Integer contagem) {
        contarPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contarPalavrasMap.isEmpty()) {
            contarPalavrasMap.remove(palavra);
        } else {
            System.out.println("Essa palavra não esta presente no Map");
        }
    }
}
