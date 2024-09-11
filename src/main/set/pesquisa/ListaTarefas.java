package main.set.pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefas;

    public ListaTarefas(){
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = tarefa;
                break;
            }
        }
        tarefas.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefas);
    }

    public void contarTarefas(){
        System.out.println(tarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : tarefas){
            if(tarefa.getFeita()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa : tarefas){
            if(!tarefa.getFeita()){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equals(descricao)){
                if(!tarefa.getFeita()){
                    tarefa.setFeita(true);
                    break;
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equals(descricao)){
                if(tarefa.getFeita()){
                    tarefa.setFeita(false);
                    break;
                }
            }
        }
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Dormir");
        listaTarefas.adicionarTarefa("Limpar casa");
        listaTarefas.adicionarTarefa("Limpar carro");
        listaTarefas.adicionarTarefa("Limpar terreno");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Dormir");

        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        listaTarefas.marcarTarefaConcluida("Limpar carro");
        listaTarefas.marcarTarefaConcluida("Limpar casa");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Limpar carro");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }


}
