package main.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirEstoqueProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotal(){
        double total = 0;
        if(!estoqueProdutos.isEmpty()){
            for(Produto produto : estoqueProdutos.values()){
                total += produto.getPreco() * produto.getQuantidade();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto produto : estoqueProdutos.values()){
            if(produto.getPreco() > maiorPreco){
                produtoMaisCaro = produto;
                maiorPreco = produtoMaisCaro.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto produto : estoqueProdutos.values()){
            if(produto.getPreco() < menorPreco){
                produtoMaisBarato = produto;
                menorPreco = produtoMaisBarato.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto produto : estoqueProdutos.values()){
            if(produto.getPreco() * produto.getQuantidade() > maiorPreco){
                produtoMaisCaro = produto;
                maiorPreco = produtoMaisCaro.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1l, "Produto1", 10, 1.00);
        estoqueProdutos.adicionarProduto(2l, "Produto2", 9, 2.00);
        estoqueProdutos.adicionarProduto(3l, "Produto3", 2, 5.00);
        estoqueProdutos.adicionarProduto(4l, "Produto4", 3, 3.00);
        estoqueProdutos.adicionarProduto(5l, "Produto5", 11, 2.00);

        estoqueProdutos.exibirEstoqueProdutos();

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.calcularValorTotal());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
