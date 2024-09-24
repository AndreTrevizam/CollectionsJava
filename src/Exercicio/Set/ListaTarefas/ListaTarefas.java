package Exercicio.Set.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefaSet;

    //construtor
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equals(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vázio.");
        }

        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }

    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }

    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                break;
            }
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("O Set já está vázio!");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaPendente("Tarefa 1");
        listaTarefas.exibirTarefas();

    }
}
