package set.OperacaoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<String>palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavras, that.palavras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavras);
    }

    public void adicionarPalavra(String palavra){
       palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
       if(!palavras.isEmpty()){
           palavras.remove(palavra);
       }

    }

    public boolean verificarPalavra(String palavra){

        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }


    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavras=" + palavras +
                '}';
    }

    //criado somente para teste do exercicio
    /*public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("ola");
        conjunto.adicionarPalavra("bom dia");
        conjunto.adicionarPalavra("tudo bem");
        conjunto.adicionarPalavra("hello world");

        conjunto.exibirPalavrasUnicas();
        conjunto.removerPalavra("bom dia");
        conjunto.exibirPalavrasUnicas();

        System.out.println(" a palavra 'tudo bem' esta no conjunto? " + conjunto.verificarPalavra("tudo bem"))  ;
    ;

    }*/
}
