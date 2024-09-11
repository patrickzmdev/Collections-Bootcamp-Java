package main.set.pesquisa;

public class Tarefa {

    private String descricao;
    private Boolean feita = false;

    public Tarefa(String descricao, Boolean feita) {
        this.descricao = descricao;
        this.feita = feita;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getFeita() {
        return feita;
    }

    public void setFeita(Boolean feita) {
        this.feita = feita;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tarefa{");
        sb.append("descricao='").append(descricao).append('\'');
        sb.append(", feita=").append(feita);
        sb.append('}');
        return sb.toString();
    }
}
