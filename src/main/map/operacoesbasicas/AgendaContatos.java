package main.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, String> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public String pesquisarPorNome(String nome) {
        String numeroPorNome = null;
        if(!agendaContatos.isEmpty()){
           numeroPorNome=agendaContatos.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Patrick", "5312675");
        agendaContatos.adicionarContato("Pedro", "5312676");
        agendaContatos.adicionarContato("Paulo", "5312677");
        agendaContatos.adicionarContato("Patricia", "5312678");
        agendaContatos.adicionarContato("Joao", "5312679");
        agendaContatos.adicionarContato("Patrick", "5312675");

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Pedro"));
        agendaContatos.removerContato("Patrick");

        agendaContatos.exibirContatos();
    }
}
