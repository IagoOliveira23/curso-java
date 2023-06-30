package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itensCompra = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade){
        this.itensCompra.add(new Item(p, quantidade));
    }

    double valorTotal(){
        double total = 0;
        for(Item item: itensCompra){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
