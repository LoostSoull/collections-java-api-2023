package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    //atributos
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemovida = null;
        for (Tarefa t : tarefaSet) {
            if (!tarefaSet.isEmpty()) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemovida = t;
                    break;
                }
            }

        }

        tarefaSet.remove(tarefaRemovida);
    }

    public void marcarTarefaConcluida(String descricao) {

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet) {

            if (t.isConcluida()) {
                tarefasConcluidas.add(t);

            }


        }
        return tarefasConcluidas;


    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("a lista esta vazia");
        } else {
            tarefaSet.clear();
            System.out.println("lista limpa");
        }
    }


    public void exibirTarefas() {
        System.out.println("Lista com todas as Tarefas: " + tarefaSet);
    }

    public void contarTarefas() {
        System.out.println("Numero de tarefas cadastradas: " + tarefaSet.size());
    }

    //criado somente para teste
    /*public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("casa");
        listaTarefas.adicionarTarefa("mesa");
        listaTarefas.adicionarTarefa("cama");
        listaTarefas.adicionarTarefa("cadeira");


        listaTarefas.marcarTarefaConcluida("cadeira");
        listaTarefas.marcarTarefaConcluida("mesa");
        listaTarefas.removerTarefa("mesa");


        System.out.print(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("cadeira");
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.print(listaTarefas.obterTarefasConcluidas());


        listaTarefas.limparListaTarefas();

    }*/

}
