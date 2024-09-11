package main.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
           if (c.getNome().equalsIgnoreCase(nome)) {
               c.setNumero(novoNumero);
               contatoAtualizado = c;
               break;
           }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.exibirContatos();

        agenda.addContato("Patrick", 1);
        agenda.addContato("Patrick", 3);
        agenda.addContato("Patrick", 2);
        agenda.addContato("Patrick", 4);
        agenda.addContato("Patricia", 5);
        agenda.addContato("Patr", 6);
        agenda.addContato("Patrick", 1);
        agenda.addContato("Pedro", 1);

        agenda.exibirContatos();

        agenda.atualizarNumeroContato("Patricia", 25);
        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Ped"));
    }

}
