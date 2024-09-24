package Exercicio.Set.AgendaContatos;

import java.util.Objects;

public class Contato {
    //atributo
    private String nome;
    private int numero;

    //construtor
    public Contato(String nome, int numero) {
        this.numero = numero;
        this.nome = nome;
    }

    //getter
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    //setter
    public void setNumero(int numero) {
        this.numero = numero;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
