package Exercicio.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    //metodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Estudar hoje");
        listaTarefa.adicionarTarefa("Estudar hoje");
        listaTarefa.adicionarTarefa("Estudar hoje e amanhã");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Estudar hoje");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
