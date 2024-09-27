package Exercicio.Map.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Palavra não encontrada!");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionário vazio!");
        }

    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        } else {
            System.out.println("Palavra não encontrada!");
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Ter", "Possuir algo");
        dicionario.adicionarPalavra("Dicionario", "Compilação completa ou parcial das unidades léxicas de uma língua");
        dicionario.exibirPalavras();
        System.out.println("A definição é: " + dicionario.pesquisarPorPalavra("Ter"));
        dicionario.removerPalavra("Dicionario");
        dicionario.exibirPalavras();
    }
}
