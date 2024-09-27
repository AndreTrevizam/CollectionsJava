package Exercicio.Map.EstoqueComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    //construtor
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //metodos
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        } else {
            System.out.println("Não existe produtos no map.");
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        } else {
            System.out.println("Não existe produtos no map.");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double maiorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        } else {
            System.out.println("Não existe produtos no map.");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoEmMaiorQuantidade = null;
        int menorQuantidade = Integer.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getQuantidade() > menorQuantidade) {
                    menorQuantidade = p.getQuantidade();
                    produtoEmMaiorQuantidade = p;
                }
            }
        }
        return produtoEmMaiorQuantidade;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 1, 4.50);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 5, 14.0);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 0, 5.5);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 3, 0.0);
        estoqueProdutos.adicionarProduto(5L, "Produto 5", 100, 3.0);

        estoqueProdutos.exibirProdutos();
        System.out.println("O produto mais caro do estoque é: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O produto mais barato do estoque é: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
