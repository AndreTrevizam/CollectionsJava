package Exercicio.Set.ListaAlunos;

public class Aluno {
    private String nome;
    private double media;
    private Long matricula;

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
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", media=" + media +
                ", matricula=" + matricula +
                '}';
    }
}
