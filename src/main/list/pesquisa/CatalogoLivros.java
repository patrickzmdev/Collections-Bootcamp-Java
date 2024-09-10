package main.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();

    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }else{
            System.out.println("Lista de livros vazia");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorAnos.add(livro);
                }
            }
        }else{
            System.out.println("Lista de livros vazia");
        }
        return livrosPorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();
        c.adicionarLivro("Livro1","Autor1", 2024);
        c.adicionarLivro("Livro2","Autor2", 2023);
        c.adicionarLivro("Livro3","Autor3", 2022);
        c.adicionarLivro("Livro4","Autor4", 2021);
        c.adicionarLivro("Livro5","Autor5", 2020);
        c.adicionarLivro("Livro6","Autor6", 2021);
        c.adicionarLivro("Livro7","Autor7", 2022);
        c.adicionarLivro("Livro8","Autor8", 2023);

        System.out.println(c.pesquisarPorAutor("Autor3"));
        System.out.println(c.pesquisaPorIntervaloAnos(2022,2023));
        System.out.println(c.pesquisarPorTitulo("Livro1"));
    }
}
