package Exercicio.Set.PalavrasUnicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> conjuntoPalavrasUnicas;

    //construtor
    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        this.conjuntoPalavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavrasUnicas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(conjuntoPalavrasUnicas, that.conjuntoPalavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(conjuntoPalavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("arroz");
        conjuntoPalavrasUnicas.adicionarPalavra("arroz");
        conjuntoPalavrasUnicas.adicionarPalavra("feijão");
        conjuntoPalavrasUnicas.adicionarPalavra("bife");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("arroz"));

        conjuntoPalavrasUnicas.removerPalavra("arroz");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
