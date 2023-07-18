package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;


//import java.util.function.BinaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto p = new Produto("iPad", 1234.56, 0.5);
        /*
         * 1. A partir do produto calcular o preço real (com desconto).
         * 2. Imposto Municipal: >= 2500 (8.5%)/ < 2500 (isento).
         * 3. Frete: >= 3000 (100)/ < 3000 (50).
         * 4. Arrendondar: Deixar duas casas decimais.
         * 5. Formatar: R$1234,54.
         */

        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = preco -> ("RS" + preco).replace(".",",");

        String preco = precoFinal
        .andThen(impostoMunicipal)
        .andThen(frete)
        .andThen(arredondar)
        .andThen(formatar)
        .apply(p);

        System.out.println("O preco final é: " + preco);
    }
}
