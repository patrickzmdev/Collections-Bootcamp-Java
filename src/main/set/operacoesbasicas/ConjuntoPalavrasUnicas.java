package main.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicas = new HashSet<>();
    }

    public void adicionaPalavra(String palavra) {
        String palavraNova = null;
        for(String palavraAux : palavrasUnicas) {
            if(palavra.equals(palavraAux)) {
                palavraNova = palavraAux;
            }
        }
        if(palavraNova != null) {
            System.out.println("Palavra já existente");
        }else{
            palavrasUnicas.add(palavra);
        }
    }

    public void removePalavra(String palavra) {
        String palavraParaRemover = null;
        for(String palavraRemover : palavrasUnicas) {
            if(palavraRemover.equals(palavra)) {
                palavraParaRemover = palavraRemover;
                break;

            }
        }if (palavraParaRemover != null) {
            palavrasUnicas.remove(palavraParaRemover);
            System.out.println("palavra " + palavraParaRemover +" removida com sucesso");
        }else{
            System.out.println("Nao foi possivel remover palavra");
        }
    }

    public void verificaPalavras(String palavra) {
        String palavraParaVerificar = null;
        for(String palavraVerificar : palavrasUnicas) {
            if(palavraVerificar.equals(palavra)) {
                palavraParaVerificar = palavraVerificar;
                break;
            }
        }if(palavraParaVerificar != null) {
            System.out.println("Palavra " + palavraParaVerificar  + " encontrada");
        }else{
            System.out.println("Palavra nã encontrada");
        }
    }

    public void exibirPalavrasUnicas(){
        for(String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionaPalavra("Palavra");
        conjunto.adicionaPalavra("Palavra1");
        conjunto.adicionaPalavra("Palavra2");
        conjunto.adicionaPalavra("Palavra3");
        conjunto.adicionaPalavra("Palavra4");
        conjunto.adicionaPalavra("Palavra5");
        conjunto.adicionaPalavra("Palavra6");
        conjunto.adicionaPalavra("Palavra7");
        conjunto.adicionaPalavra("Palavra8");
        conjunto.adicionaPalavra("Palavra9");
        conjunto.adicionaPalavra("Palavra1");
        conjunto.adicionaPalavra("Palavra2");
        conjunto.adicionaPalavra("Palavra3");

        conjunto.exibirPalavrasUnicas();

        conjunto.removePalavra("Palavra12");
        conjunto.verificaPalavras("Palavra1");
    }
}
