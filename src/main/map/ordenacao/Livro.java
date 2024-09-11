package main.map.ordenacao;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Livro outroLivro) {
        return Double.compare(this.preco, outroLivro.getPreco());
    }
}

class ComparatorPorPreco implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

