package Exercicio.SomaDeNumeros;

import java.util.*;

public class SomaNumeros {
    //atributo
    private List<Numero> numeroList;

    //construtor
    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    //metodos
    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public int calcularSoma(){
        int total = 0;
        if (!numeroList.isEmpty()) {
            for (Numero numero : numeroList) {
                int valorNum = numero.getNumero();
                total += valorNum;
            }
        }
        return total;
    }

    public int encontrarMaiorNumero() {
        int maior = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
            for (Numero numero : numeroList) {
                int valorNum = numero.getNumero();
                if (valorNum > maior) {
                    maior = valorNum;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
            for (Numero numero : numeroList) {
                int valorNum = numero.getNumero();
                if (valorNum < menor) {
                    menor = valorNum;
                }
            }
        }
        return menor;
    }

    public List<Numero> exibirNumeros() {
        return numeroList;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(90);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.exibirNumeros());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }
}
