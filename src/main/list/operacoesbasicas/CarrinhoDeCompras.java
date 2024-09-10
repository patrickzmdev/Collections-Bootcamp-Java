package main.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        Item novoItem = new Item(nome, preco, quantidade);
        this.carrinhoDeCompras.add(novoItem);
    }

    public void removerItem(String nome) {
        List<Item> itenRemover = new ArrayList<>();
        for (Item item : this.carrinhoDeCompras) {
            if (item.getNome().equals(nome)) {
                itenRemover.add(item);
            }
        }
        carrinhoDeCompras.removeAll(itenRemover);
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Item item : this.carrinhoDeCompras) {
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Total: " + total);
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Tenis", 10.00, 2);
        carrinhoDeCompras.adicionarItem("Sapato", 12.00, 10);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.removerItem("Tenis");
        carrinhoDeCompras.exibirItens();
    }




}
