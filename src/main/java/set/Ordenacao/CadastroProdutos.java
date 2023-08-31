package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cad = new CadastroProdutos();

        cad.adicionarProduto(1111,"sabao" , 12.5,1);
        cad.adicionarProduto(2222,"bucha" , 10.5,2);
        cad.adicionarProduto(4444,"pia" , 122.5,15);
        cad.adicionarProduto(5555,"bombril" , 5,1);


        System.out.println(cad.exibirProdutosPorNome());

         System.out.println(cad.exibirProdutosPorPreco());
    }

}
