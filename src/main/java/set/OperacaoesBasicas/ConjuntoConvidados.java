package set.OperacaoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributos

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public void contarConvidados() {
        System.out.println(convidadoSet.size());
    }

    public void exibirConvidados() {

        System.out.println(convidadoSet);
    }

    //Exemplo criado para execução dos testes
    /*public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        conjunto.adicionarConvidado("lucas", 111);
        conjunto.adicionarConvidado("lucas", 222);
        conjunto.adicionarConvidado("metallica", 333);
        conjunto.adicionarConvidado("slayer", 444);

        conjunto.exibirConvidados();

        conjunto.contarConvidados();

        conjunto.removerConvidadoPorCodigoConvite(222);

        conjunto.exibirConvidados();
        conjunto.contarConvidados();
    }*/
}


