package Exercicio.Set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> agendaContatos;

    //construtor
    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> pesquisaNome = new HashSet<>();
        for (Contato c : agendaContatos) {
            if (c.getNome().startsWith(nome)) {
                pesquisaNome.add(c);
            }
        }
        return pesquisaNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : agendaContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 123);
        agendaContatos.adicionarContato("Contato 2", 1235);
        agendaContatos.adicionarContato("Contato 3", 1234);
        agendaContatos.adicionarContato("Contato 4", 123);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Contato 3"));
        agendaContatos.atualizarNumeroContato("Contato 4", 123456);
        agendaContatos.exibirContatos();
    }
}
