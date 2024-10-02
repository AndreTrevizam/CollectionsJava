package Exercicio.Map.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        livrosMap.remove(titulo);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        /*para comparar os valores do livro, precisamos
        * criar uma lista, pq com o TreeMap nos so conseguimos comparar as keys
        */
        List<Livro> livrosList = new ArrayList<>(livrosMap.values());

        // Ordenar os livros pelo preço de forma crescente
        livrosList.sort(Comparator.comparing(Livro::getPreco));

        for (Livro livro : livrosList) {
            System.out.println(livro);
        }
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro l : livrosMap.values()) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public Double obterLivroMaisCaro() {
        Double livroMaisCaro = Double.MIN_VALUE;
        for (Livro livro : livrosMap.values()) {
            if (livro.getPreco() > livroMaisCaro) {
                livroMaisCaro = livro.getPreco();
            }
        }
        return livroMaisCaro;
    }

    public Double obterLivroMaisBarato() {
        Double livroMaisBarato = Double.MAX_VALUE;
        for (Livro livro : livrosMap.values()) {
            if (livro.getPreco() < livroMaisBarato) {
                livroMaisBarato = livro.getPreco();
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("amazon.com", "Marx", "Karlos Marx", 10.5);
        livrariaOnline.adicionarLivro("amazon.com/seila", "seila", "Karlos Marx", 1.5);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        System.out.println("O livro mais caro da loja custa: R$" + livrariaOnline.obterLivroMaisCaro());
        System.out.println("O livro mais barato da loja custa: R$" + livrariaOnline.obterLivroMaisBarato());

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Karlos Marx"));

    }
}

