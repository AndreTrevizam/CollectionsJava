package Exercicio.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //atributo
    private List<Livro> livroList;

    //construtor
    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    //metodos

    public void adicionarLivro(String titulo, String autor, int anoPubli) {
        livroList.add(new Livro(titulo, autor, anoPubli));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPubli() >= anoInicial && livro.getAnoPubli() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro", "Autor", 2019);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2015);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2013);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2020);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 2012);

        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2013, 2020));
    }
}

