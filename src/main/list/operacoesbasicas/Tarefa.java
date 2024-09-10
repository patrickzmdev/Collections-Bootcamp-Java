package main.list.operacoesbasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tarefa{");
        sb.append("descricao='").append(descricao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
