package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //atributos
    private Map<Long, Produto> estoqueDeProdutosMap;

    public EstoqueProdutos() {
        this.estoqueDeProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueDeProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueDeProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if (!estoqueDeProdutosMap.isEmpty()) {
            for (Produto p : estoqueDeProdutosMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }

        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double produtoEmEstoqueMaisCaro = Double.MIN_VALUE;

        for (Produto p : estoqueDeProdutosMap.values()) {
            if (p.getPreco() > produtoEmEstoqueMaisCaro) {

                produtoMaisCaro = p;
                produtoEmEstoqueMaisCaro = p.getPreco();
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double maisBarato = Double.MAX_VALUE;

        for (Produto p : estoqueDeProdutosMap.values()) {
            if (p.getPreco() < maisBarato) {
                produtoMaisBarato = p;
                maisBarato = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueDeProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueDeProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1111, "luva", 1, 10.0);
        estoque.adicionarProduto(122, "luva2", 2, 20.0);
        estoque.adicionarProduto(22, "luva3", 4, 25.0);
        estoque.adicionarProduto(1232, "luva4", 4, 25.50);
        estoque.exibirProdutos();
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBarato());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }


}
