package Exercicio.Map.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //metodos

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("O map está vazio!");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("Nome não encontrado!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Andre", 123);
        agendaContatos.adicionarContato("Jorge", 1234);
        agendaContatos.adicionarContato("Matuto", 12345);
        System.out.println("O número é " + agendaContatos.pesquisarPorNome("Andre"));
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Jorge");
        agendaContatos.exibirContatos();

    }
}
