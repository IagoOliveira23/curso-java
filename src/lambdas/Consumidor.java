package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + " <<<");

        Produto p1 = new Produto("Caneta", 2.50, 0.1);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Lápis", 2.0, 0.05);
        Produto p3 = new Produto("Caderno", 35.99, 0.15);
        Produto p4 = new Produto("Borracha", 3.50, 0.02);
        Produto p5 = new Produto("Régua", 3.0, 0.0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
