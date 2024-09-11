package main.set.ordenacao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(Long cod, String nome, Double nota) {
        alunos.add(new Aluno(cod, nome, nota));
    }

    public void removerAluno(Long cod) {
        for (Aluno aluno : alunos) {
            if(Objects.equals(aluno.getMatricula(), cod)){
                alunos.remove(aluno);
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno(1L, "Aluno 1", 2.0);
        gerenciador.adicionarAluno(2L, "Aluno 2", 1.0);
        gerenciador.adicionarAluno(1L, "Aluno 3", 3.0);
        gerenciador.adicionarAluno(4L, "Aluno 5", 4.0);
        gerenciador.adicionarAluno(5L, "Aluno 4", 1.5);

        gerenciador.exibirAlunos();
        gerenciador.removerAluno(5L);
        System.out.println(gerenciador.exibirAlunosPorNome());
        System.out.println(gerenciador.exibirAlunosPorNota());
    }

}
