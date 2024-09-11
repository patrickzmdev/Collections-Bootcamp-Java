package main.set.pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return numero == contato.numero && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contato{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }
}
