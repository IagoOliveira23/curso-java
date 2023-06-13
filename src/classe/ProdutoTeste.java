package classe;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        System.out.println("Nome: " + p1.nome);
        System.out.println("Preço: " + p1.preco);
        System.out.println("Desconto: " + p1.desconto);

        double precoFinal = p1.desconto();
        System.out.printf("Preço final = R$%.2f", precoFinal);
    }
}
