package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributos
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }

    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dici = new Dicionario();

        dici.adicionarPalavra("lucas", "sabio");
        dici.adicionarPalavra("guitarra", "rock");
        dici.adicionarPalavra("naruto", "sasuke");
        dici.adicionarPalavra("goku", "vegeta");

        dici.exibirPalavras();
        dici.removerPalavra("naruto");
        dici.exibirPalavras();
        System.out.println(dici.pesquisarPorPalavra("goku"));

    }
}


