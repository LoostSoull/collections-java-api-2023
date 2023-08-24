package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class SomaNumeros {

    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numerosList.isEmpty()){
            for(Integer numeros : numerosList){
                soma += numeros;
            }
        }return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        for(Integer numeros : numerosList){
            if(numeros > maiorNumero){
                maiorNumero = numeros;
            }
        }return maiorNumero;

    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosList.isEmpty()){
            for(Integer numero : numerosList){
                if(menorNumero > numero){
                    menorNumero = numero;
                }
            }
        }return menorNumero;
    }


    public void exibirNumeros(){
        System.out.println(numerosList);
    }


    public String toString() {
        return "SomaNumeros{" +
                "numerosList=" + numerosList +
                '}';
    }


    //Teste pratico da classe
    /*public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(1);
        soma.adicionarNumero(2);
        soma.adicionarNumero(3);
        soma.adicionarNumero(4);
        soma.adicionarNumero(5);
        soma.adicionarNumero(6);
        soma.adicionarNumero(7);
        soma.adicionarNumero(8);
        soma.adicionarNumero(9);
        soma.adicionarNumero(10);

        soma.exibirNumeros();
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMenorNumero());
        System.out.println(soma.calcularSoma());


    }*/
}


