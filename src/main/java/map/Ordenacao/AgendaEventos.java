package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //atributos
    private Map<LocalDate,Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data,new Evento(nome,atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventoMapTree = new TreeMap<>(eventoMap);
        System.out.println(eventoMapTree);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> eventoMapTree = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate,Evento> entry : eventoMapTree.entrySet()){
            if(entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
               proximaData = entry.getKey();
               proximoEvento = entry.getValue();
                System.out.println("o proximo evento sera: " + proximoEvento + " " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();
        eventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER,15),"evento 1","aniversario");
        eventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER,25),"evento 2","aniversario");
        eventos.adicionarEvento(LocalDate.of(2022, Month.SEPTEMBER,15),"evento 3","aniversario");
        eventos.exibirAgenda();
        eventos.obterProximoEvento();


    }
}
