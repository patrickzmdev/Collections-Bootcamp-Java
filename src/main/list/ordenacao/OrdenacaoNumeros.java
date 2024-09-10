package main.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosOrdenado = new ArrayList<>(numerosList);
        Collections.sort(numerosOrdenado);
        return numerosOrdenado;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosOrdenado = new ArrayList<>(numerosList);
        Collections.sort(numerosOrdenado, new ComparatorOrdemDesc());
        return numerosOrdenado;

        }

    class ComparatorOrdemDesc implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o2, o1);
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(10);
        System.out.println("Ordem ascendente");
        System.out.println(numeros.ordenarAscendente());
        System.out.println("Ordem descendente");
        System.out.println(numeros.ordenarDescendente());
    }


}
