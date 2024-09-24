package Exercicio.Set.ListaTarefas;

import java.util.Objects;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean concluida;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    //getters
    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return isConcluida() == tarefa.isConcluida() && Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return descricao.hashCode();
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
