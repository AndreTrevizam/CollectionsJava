package Exercicio.Set.ListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private double media;
    private long matricula;

    public Aluno(String nome, double media, Long matricula) {
        this.nome = nome;
        this.media = media;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public Long getMatricula() {
        return matricula;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(getMedia(), aluno.getMedia()) == 0 && Objects.equals(getNome(), aluno.getNome()) && Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getMedia(), getMatricula());
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", media=" + media +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}