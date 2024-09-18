package Exercicio.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Carrinho> carrinhoList;

    //construtor
    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    //metodos
    public void adicionarItem(String nome, double preco, int quantidade){
        Carrinho item = new Carrinho(nome, preco, quantidade);
        this.carrinhoList.add(item);
    }

    public void removerItem(String nome) {
        List<Carrinho> itensParaRemover = new ArrayList<>();
        for (Carrinho item : carrinhoList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        carrinhoList.removeAll(itensParaRemover);
    }

    public double calcularTotal() {
        double valorTotal = 0d;
        for (Carrinho itens : carrinhoList) {
            double valorItem = itens.getQuantidade() * itens.getPreco();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(carrinhoList);
    }

    //main
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularTotal());

    }
}
