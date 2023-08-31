package set.Ordenacao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class GerenciadorAlunos {

    //atributos

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            System.out.println("Essa Lista esta vazia, impossivel remover!");
        }


    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunosPorNome);
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        }

    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    //criado para teste de classe
    public static void main(String[] args) {
        GerenciadorAlunos gera = new GerenciadorAlunos();

        gera.adicionarAluno("lucas", 1111, 10.0);
        gera.adicionarAluno("alberto", 2222, 9.0);
        gera.adicionarAluno("bruno", 3333, 8.0);
        gera.adicionarAluno("carlos", 4444, 5.0);

        gera.exibirAlunos();

        gera.removerAluno(3333);
        gera.exibirAlunos();


        gera.exibirAlunosPorNota();
        gera.exibirAlunosPorNome();
    }
}
