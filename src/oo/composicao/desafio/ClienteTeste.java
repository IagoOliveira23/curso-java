package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.adicionarItem(new Produto("Lápis", 2.50), 2);
        
        Compra c2 = new Compra();
        c2.adicionarItem(new Produto("Caderno", 35), 2);

        Cliente cli = new Cliente("José");
        cli.adicionarCompra(c1);
        cli.adicionarCompra(c2);

        System.out.println(cli.valorTotal());


    }
}
