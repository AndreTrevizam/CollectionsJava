package Exercicio.Set.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    //construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            } else {
                throw new RuntimeException("Não existe convidado com este código de convite.");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("André", 23);
        conjuntoConvidados.adicionarConvidado("Marcelo", 22);
        conjuntoConvidados.adicionarConvidado("Gustavo", 10);
        conjuntoConvidados.adicionarConvidado("Shrek", 23);
        //conjuntoConvidados.removerConvidadoPorCodigoConvite(12);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de Convidados");
        conjuntoConvidados.exibirConvidados();
    }

}
