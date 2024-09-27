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
        if (contarPalavrasMap.containsKey(palavra)) {
            contarPalavrasMap.put(palavra, contarPalavrasMap.get(palavra) + contagem);
        } else {
            contarPalavrasMap.put(palavra, contagem);
        }
    }

    public void removerPalavra(String palavra) {
        if (!contarPalavrasMap.isEmpty()) {
            contarPalavrasMap.remove(palavra);
        } else {
            System.out.println("Essa palavra não esta presente no Map");
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contarPalavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entrada : contarPalavrasMap.entrySet()) {
            if (entrada.getValue() > maiorContagem) {
                palavraMaisFrequente = entrada.getKey();
                maiorContagem = entrada.getValue();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Olá", 1);
        contagemPalavras.adicionarPalavra("Mundo", 1);
        contagemPalavras.adicionarPalavra("Olá", 1);
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
        contagemPalavras.exibirContagemPalavras();
    }
}
