package main.map.ordenacao;

public class Evento {

    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Evento{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", atracao='").append(atracao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
