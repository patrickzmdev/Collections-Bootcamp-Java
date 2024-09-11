package main.map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventos.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosThreeMap = new TreeMap<>(eventos);
        System.out.println(eventosThreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosThreeMap = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate, Evento> entry : eventosThreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024,10,9), "Aniversario", "Atracao1");
        agendaEventos.adicionarEvento( LocalDate.of(2024,10,19), "Aniversario1", "Atracao2");
        agendaEventos.adicionarEvento(LocalDate.of(2024,10,29), "Aniversario2", "Atracao3");
        agendaEventos.adicionarEvento(LocalDate.of(2024,11,19), "Aniversario3", "Atracao4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
