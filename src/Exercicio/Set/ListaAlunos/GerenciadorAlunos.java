package Exercicio.Set.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    private void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, media, matricula));
    }

    private void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        System.out.println(alunoPorNome);;
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        System.out.println(alunoPorNota);
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 1L, 3.5);
        gerenciadorAlunos.adicionarAluno("Anderson", 2L, 5.5);
        gerenciadorAlunos.adicionarAluno("Jefforson", 3L, 10.);
        gerenciadorAlunos.adicionarAluno("Bianca", 4L, 9.5);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
