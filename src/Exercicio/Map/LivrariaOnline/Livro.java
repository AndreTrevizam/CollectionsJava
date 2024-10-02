package Exercicio.Map.LivrariaOnline;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String nome, String autor, double preco) {
        this.titulo = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
