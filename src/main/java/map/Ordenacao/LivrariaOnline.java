package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    //atributos

    private Map<String, Livro> linkLivroLivroMap;

    public LivrariaOnline() {
        this.linkLivroLivroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        linkLivroLivroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> livroRemove = new ArrayList<>();

        for (Map.Entry<String, Livro> l : linkLivroLivroMap.entrySet()) {
            if (l.getValue().getTitulo().equalsIgnoreCase(titulo)) {

                livroRemove.add(l.getKey());
            }
        }
        for (String l : livroRemove) {
            linkLivroLivroMap.remove(l);
        }

    }

    public void exibirLivrosOrdenadosPorPreco() {
        Map<String, Livro> livrosPorPreço = new TreeMap<>(linkLivroLivroMap);
        System.out.println(livrosPorPreço);

    }

    public void pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        for (Map.Entry<String, Livro> l : linkLivroLivroMap.entrySet()) {
            if (l.getValue().getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l.getValue());
            }
        }
        for (Livro l : livrosPorAutor) {
            System.out.println(l);
        }
    }

    public List<Livro> obterLivroMaisCaro() {
        double livroMaisCaro = Double.MIN_VALUE;
        List<Livro> livroMaiorValor = new ArrayList<>();

        for (Livro livro : linkLivroLivroMap.values()) {

            if (livro.getPreco() > livroMaisCaro) {
                livroMaisCaro = livro.getPreco();
            }
        }

        for (Map.Entry<String, Livro> livro : linkLivroLivroMap.entrySet()) {
            if (livro.getValue().getPreco() == livroMaisCaro) {
                Livro livroCaro = linkLivroLivroMap.get(livro.getKey());
                livroMaiorValor.add(livroCaro);
            }
        }
        return livroMaiorValor;


    }

    public List<Livro> exibirLivroMaisBarato() {
        List<Livro> livroBarato = new ArrayList<>();
        Double livroMaisBarato = Double.MAX_VALUE;

        for (Livro livro : linkLivroLivroMap.values()) {
            if (livro.getPreco() < livroMaisBarato) {
                livroMaisBarato = livro.getPreco();
            }

        }
        for (Map.Entry<String, Livro> livro : linkLivroLivroMap.entrySet()) {

            if (livro.getValue().getPreco() == livroMaisBarato) {
                Livro livroEmConta = linkLivroLivroMap.get(livro.getKey());
                livroBarato.add(livroEmConta);
            }

        }
        return livroBarato;
    }

   /* criado para testes da classe
   public static void main(String[] args) {
        LivrariaOnline livro = new LivrariaOnline();

        livro.adicionarLivro("livro.com", "harry potter", "jk", 10.0);
        livro.adicionarLivro("livro.com.br", "hobbit", "tolkien", 11.0);
        livro.adicionarLivro("livro.com.net", "star wars", "jLucas", 12.0);

        livro.exibirLivrosOrdenadosPorPreco();
        livro.pesquisarLivrosPorAutor("jk");
        System.out.println(livro.obterLivroMaisCaro());
        System.out.println(livro.exibirLivroMaisBarato());

    }*/
}
