package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {

        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){

        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoaPorAltura , new comparetorPorAltura());
        return pessoaPorAltura;
    }

    public void verPessoas(){

        System.out.println(pessoas);
    }

    //Testes para validar o funcionamento
   /* public static void main(String[] args) {
        OrdenacaoPessoas ordem = new OrdenacaoPessoas();

        ordem.adicionarPessoa("lucas", 20 , 1.56);
        ordem.adicionarPessoa("luan", 30 , 1.86);
        ordem.adicionarPessoa("daniela", 25 , 1.76);
        ordem.adicionarPessoa("daniel", 17 , 1.56);


        System.out.println(ordem.ordenarPorAltura());
        System.out.println( ordem.ordenarPorIdade());



    }*/
}
