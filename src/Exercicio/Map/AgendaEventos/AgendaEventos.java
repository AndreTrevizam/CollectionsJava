package Exercicio.Map.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> dateMap;

    public AgendaEventos() {
        this.dateMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        dateMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> treeDataMap = new TreeMap<>(dateMap);
        System.out.println(treeDataMap);
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> treeDataMap = new TreeMap<>(dateMap);
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate, Evento> entry: treeDataMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + ". Vai ser na data: " + proximaData);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 01), "Evento 1", "Evento 1 - Descrição");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 30), "Evento 2", "Evento 2 - Descrição");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 10), "Evento 3", "Evento 3 - Descrição");

        agendaEventos.obterProximoEvento();
    }
}
