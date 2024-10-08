package main.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenadas, new ComparatorPorAltura());
        return pessoasOrdenadas;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome3", 25, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome4", 17, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
