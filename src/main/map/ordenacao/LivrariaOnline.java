package main.map.ordenacao;

import java.util.*;

public class LivrariaOnline {

    private final Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, Double preco) {
        Livro livro = new Livro(titulo, autor, preco);
        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        livrosMap.remove(titulo);
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livros = new ArrayList<>(livrosMap.entrySet());
        livros.sort(Map.Entry.comparingByValue(new ComparatorPorPreco()));

        for(Map.Entry<String, Livro> livro : livros){
            System.out.println(livro.getKey() + " - " + livro.getValue().getPreco());
        }
    }

    public void pesquisarLivrosPorAutor(String autor){
        List<Livro> livros = new ArrayList<>();
        for(Map.Entry<String, Livro> livro : livrosMap.entrySet()){
            if(livro.getValue().getAutor().equals(autor)){
                livros.add(livro.getValue());
            }
        }
        System.out.println(livros);
    }

    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double maiorPreco = 0;
        for(Map.Entry<String, Livro> livro : livrosMap.entrySet()){
            if(livro.getValue().getPreco() > maiorPreco){
                maiorPreco = livro.getValue().getPreco();
                livroMaisCaro = livro.getValue();
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Map.Entry<String, Livro> livro : livrosMap.entrySet()){
            if(livro.getValue().getPreco() < menorPreco){
                menorPreco = livro.getValue().getPreco();
                livroMaisBarato = livro.getValue();

            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
      LivrariaOnline livrariaOnline = new LivrariaOnline();
      livrariaOnline.adicionarLivro("1", "Livro1", "Autor1", 10.00);
      livrariaOnline.adicionarLivro("2", "Livro5", "Autor5", 8.00);
      livrariaOnline.adicionarLivro("3", "Livro4", "Autor1", 9.00);
      livrariaOnline.adicionarLivro("4", "Livro3", "Autor3", 11.00);
      livrariaOnline.adicionarLivro("5", "Livro2", "Autor2", 15.00);
      livrariaOnline.exibirLivrosOrdenadosPorPreco();
      livrariaOnline.pesquisarLivrosPorAutor("Autor1");
      System.out.println(livrariaOnline.obterLivroMaisCaro());
      System.out.println(livrariaOnline.obterLivroMaisBarato());
      livrariaOnline.removerLivro("2");
      livrariaOnline.exibirLivrosOrdenadosPorPreco();

    }


}


