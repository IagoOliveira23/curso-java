package ooComposicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Ednaldo Pereira";

        compra1.itens.add(new Item("Notebook", 1, 3500));
        compra1.adcionaritem(new Item("Mouse", 1, 120));
        compra1.adcionaritem("Mouse Pad", 1, 50);

        
        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
