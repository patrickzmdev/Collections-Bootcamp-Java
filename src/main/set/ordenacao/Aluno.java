package main.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private Long matricula;
    private String nome;
    private double nota;

    public Aluno(Long matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    public Long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alunos{");
        sb.append("matricula=").append(matricula);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno alunos = (Aluno) o;
        return Objects.equals(matricula, alunos.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public int compareTo(Aluno o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}

class ComparatorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
