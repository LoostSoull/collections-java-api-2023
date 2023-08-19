package list;

import list.operacoesBasicas.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos

    private List<Item> items;

    public CarrinhoDeCompras() {
        this.items = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco,quantidade);
        items.add(item);
    }

    public void removerItem(String nome){

        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : items){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
    items.removeAll(itensParaRemover);
    }

    public Double calcularValorTotal(){
       Double totalCompra = 0.0;
        for(Item valor : items){
            totalCompra += valor.getPreco();
        }
        return totalCompra;
    }

    public void exibirItens(){
        System.out.println(items);
    }

   /*

    Incluido somente para teste das funções

    public static void main(String[] args) {
        CarrinhoDeCompras carro = new CarrinhoDeCompras();

        carro.adicionarItem("tvv" , 10.0 , 1);
        carro.adicionarItem("tvv" , 10.0 , 1);
        carro.adicionarItem("tv" , 10.0 , 1);

        carro.exibirItens();


        System.out.println(carro.calcularValorTotal());

        carro.removerItem("tvv");

        carro.exibirItens();


    }*/
}
