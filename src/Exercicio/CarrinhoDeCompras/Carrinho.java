package Exercicio.CarrinhoDeCompras;

public class Carrinho {
    private String nome;
    private double preco;
    private int quantidade;

    public Carrinho(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - " +  "Preço: " + preco + " - " + "Quantidade: " + quantidade;
    }
}
