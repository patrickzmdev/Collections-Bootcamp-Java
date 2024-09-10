package main.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removeConvidadoPorCodigoConvite(Integer codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        if (convidadoParaRemover != null) {
            convidadoSet.remove(convidadoParaRemover);
        }else {
            System.out.println("Convidado nao encontrado");
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        for (Convidado convidado : convidadoSet) {
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conj = new ConjuntoConvidados();
        System.out.println("Existem " + conj.convidadoSet.size() + " convidados dentro do set");

        conj.addConvidado("Gabriel", 1);
        conj.addConvidado("Maria", 2);
        conj.addConvidado("Joao", 3);
        conj.addConvidado("Pedro", 4);
        conj.addConvidado("Rafael", 5);
        conj.addConvidado("Gabriela", 6);
        conj.addConvidado("Joana", 7);
        conj.addConvidado("Patricia", 8);
        conj.addConvidado("Patrick", 9);
        conj.addConvidado("Gabriel", 1);

        System.out.println("Agora existem " + conj.convidadoSet.size() + " convidados dentro do set");

        conj.exibirConvidados();
        System.out.println("Contagem dos convidados");
        System.out.println(conj.contarConvidados());

        System.out.println("Metodo remoção");
        conj.removeConvidadoPorCodigoConvite(6);

        System.out.println("Exibindo convidados restantes");
        conj.exibirConvidados();



    }
}
