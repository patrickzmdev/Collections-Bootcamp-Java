package main.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    List<Integer> listaNumeros;

    public SomaNumeros(){
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public Integer calcularSoma(){
        int soma = 0;
        for(Integer numero : listaNumeros){
            soma += numero;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero(){
        int maior = 0;
        for(Integer numero : listaNumeros){
            if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }

    public Integer encontrarMenorNumero(){
        int menor = 1000000000;
        for(Integer numero : listaNumeros){
            if(numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        for(Integer numero : listaNumeros){
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
