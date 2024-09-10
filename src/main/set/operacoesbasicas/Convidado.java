package main.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Convidado{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", codigoConvite=").append(codigoConvite);
        sb.append('}');
        return sb.toString();
    }
}
