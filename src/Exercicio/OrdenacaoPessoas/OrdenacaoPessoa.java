package Exercicio.OrdenacaoPessoas;

import java.util.*;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    //construtor
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    //metodos
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("André", 20, 1.85);
        ordenacaoPessoa.adicionarPessoa("Marcelo", 22, 1.70);
        ordenacaoPessoa.adicionarPessoa("Gustavo", 21, 1.75);
        ordenacaoPessoa.adicionarPessoa("Guilherme", 20, 1.68);
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }
}
