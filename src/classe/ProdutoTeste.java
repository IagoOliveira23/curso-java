package classe;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        Produto.desconto = 0.15;

        System.out.println("Nome: " + p1.nome);
        System.out.println("Preço: " + p1.preco);
        System.out.println("Desconto: " + Produto.desconto);

        double precoFinalN = p1.desconto();
        System.out.printf("Preço final = R$%.2f\n", precoFinalN);

        Produto p2 = new Produto("Celular");
        p2.preco = 2599.99;
        Produto.desconto = 0.30;

        System.out.println("\nNome: " + p2.nome);
        System.out.println("Preço: " + p2.preco);
        System.out.println("Desconto: " + Produto.desconto);

        double precoFinalC = p2.desconto();
        System.out.printf("Preço final = R$%.2f\n", precoFinalC);

        Produto p3 = new Produto("Teclado", 250);
        System.out.println("\nNome: " + p3.nome);
        System.out.println("Preço: " + p3.preco);
        System.out.println("Desconto: " + Produto.desconto);

        double precoFinalT = p3.desconto();
        System.out.printf("Preço final = R$%.2f\n", precoFinalT);
    }
}
