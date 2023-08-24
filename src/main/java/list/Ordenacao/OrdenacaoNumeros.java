package list.Ordenacao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {

   private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }


    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer>numeroOrdenarAscendente = new ArrayList<>(numeros);
        if(!numeros.isEmpty()){
            Collections.sort(numeroOrdenarAscendente);
        }return numeroOrdenarAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer>numeroOrdenarDescendente = new ArrayList<>(numeros);
        if(!numeros.isEmpty()){
            Collections.sort(numeroOrdenarDescendente, Collections.reverseOrder());
        }return numeroOrdenarDescendente;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    //Testes para validar o funcionamento
    /*public static void main(String[] args) {
        OrdenacaoNumeros ordem = new OrdenacaoNumeros();

        ordem.adicionarNumero(1);
        ordem.adicionarNumero(2);
        ordem.adicionarNumero(3);
        ordem.adicionarNumero(4);

        System.out.println(ordem.ordenarAscendente());
        System.out.println(ordem.ordenarDescendente());
    }*/
}
