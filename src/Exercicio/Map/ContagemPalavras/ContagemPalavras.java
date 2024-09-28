package Exercicio.Map.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    private Map<String, Integer> palavrasMap;

    //construtor
    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    //métodos

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        } else {
            System.out.println("A palavra não existe!");
        }
    }

    public int exibirContagemPalavras() {
        int contagemPalavras = 0;
        if (!palavrasMap.isEmpty()) {
            for (int contagem : palavrasMap.values()) {
                contagemPalavras += contagem;
            }
        } else {
            System.out.println("Map vazio");
        }
        return contagemPalavras;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequnte = null;
        int contagem = 0;

        if (!palavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry: palavrasMap.entrySet()) {
                if (entry.getValue() > contagem) {
                    palavraMaisFrequnte = entry.getKey();
                    contagem = entry.getValue();
                }
            }
        } else {
            System.out.println("Map vazio");
        }
        return palavraMaisFrequnte;
    }


    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("Andre", 1);
        palavras.adicionarPalavra("1", 2);
        palavras.adicionarPalavra("palavra 3", 8);

        System.out.println(palavras.exibirContagemPalavras());
        System.out.println(palavras.encontrarPalavraMaisFrequente());
    }

}
