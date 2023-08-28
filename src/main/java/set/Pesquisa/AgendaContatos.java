package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);

                }

            }
        }return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroTelefone(novoNumero);
                    contatoAtualizado = c;
                    break;
                }

            }
        } return contatoAtualizado;
    }

    //criado para teste das classes
   /* public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("vergil" , 11111);
        agenda.adicionarContato("vergil s" , 2222);
        agenda.adicionarContato("dante" , 3333);
        agenda.adicionarContato("nero" , 4444);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("ver"));

        agenda.atualizarNumeroContato("vergil", 121212);
        System.out.println(agenda.pesquisarPorNome("ver"));
    }*/
}
