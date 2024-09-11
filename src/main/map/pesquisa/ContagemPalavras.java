package main.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemPalavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavras);
    }

    public Map<String,Integer> encontrarPalavraMaisFrequente() {
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();
        int contador = 0;
        for (String palavra : contagemPalavras.keySet()) {
            if (contador < contagemPalavras.get(palavra)) {
                contador = contagemPalavras.get(palavra);
                palavraMaisFrequente.put(palavra, contador);
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras palavra = new ContagemPalavras();
        palavra.adicionarPalavra("Palavra1", 30);
        palavra.adicionarPalavra("Palavra2", 20);
        palavra.adicionarPalavra("Palavra3", 40);
        palavra.adicionarPalavra("Palavra4", 10);

        palavra.exibirContagemPalavras();
        palavra.removerPalavra("Palavra1");
        palavra.exibirContagemPalavras();
        System.out.println(palavra.encontrarPalavraMaisFrequente());
    }
}
