package main.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String,String> dicionario;

    public Dicionario() {
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra,definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }

    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPalavra(String palavra) {
        String pesquisarPorDefinicao = null;
        if(!dicionario.isEmpty()){
            pesquisarPorDefinicao = dicionario.get(palavra);
        }
        return pesquisarPorDefinicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("palavra1", "pala1");
        dicionario.adicionarPalavra("palavra2", "pala2");
        dicionario.adicionarPalavra("palavra3", "pala3");
        dicionario.adicionarPalavra("palavra4", "pala4");
        dicionario.adicionarPalavra("palavra1", "pala1");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("palavra1");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPalavra("palavra2"));
    }
}
