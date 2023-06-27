package ooComposicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    final List<Compra> comprasCliente = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    double valorTotal(){
        double total = 0;
        for(Compra compra: comprasCliente){
            total += compra.valorTotal();
        }
        return total;
    }
    void adicionarCompra(Compra compra){
        this.comprasCliente.add(compra);
    }
}
