package list.operacoesBasicas;

public class Tarefa {
    //atributos
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public String toString() {
        return descricao ;
    }

    /*

    como nao existe teste unitario, realizado teste das funções nesse bloco de codigo

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();



        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa1");
        listaTarefa.adicionarTarefa("tarefa2");
        System.out.println("numero de tarefas na lista: " + listaTarefa.obterNumeroTotalTarefas());

       listaTarefa.removerTarefa("tarefa2");
        System.out.println("numero de tarefas na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }*/
}
