package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer contatoPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            contatoPorNome = agendaContatoMap.get(nome);
        }
        return contatoPorNome;
    }

    //criado somente para teste da classe
    /*public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("lucas",114523);
        agenda.adicionarContato("lucas",11958746);
        agenda.adicionarContato("lula",145746);
        agenda.adicionarContato("luka",116);
        agenda.adicionarContato("vava",11958);

        agenda.exibirContatos();
        agenda.removerContato("lula");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("vava"));
    }*/
}
