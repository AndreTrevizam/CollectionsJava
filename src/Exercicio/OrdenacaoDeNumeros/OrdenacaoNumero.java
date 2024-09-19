package Exercicio.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    //atributo
    private List<Integer> numeroList;

    //construtor
    public OrdenacaoNumero() {
        this.numeroList = new ArrayList<>();
    }

    //metodos
    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(5);
        ordenacaoNumero.adicionarNumero(50);
        ordenacaoNumero.adicionarNumero(521);
        ordenacaoNumero.adicionarNumero(100);
        System.out.println(ordenacaoNumero.ordenarAscendente());
        System.out.println(ordenacaoNumero.ordenarDescendente());
    }
}
