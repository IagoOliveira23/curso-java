package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        Produto p1 = new Produto("notebook", 3500, 0.25);
        System.out.println(isCaro.test(p1));
    }   
}
