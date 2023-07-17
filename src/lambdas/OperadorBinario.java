package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    
    public static void main(String[] args) {
        
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.9, 7.5));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Repovado";
        System.out.println(resultado.apply(4.9, 4.2));

        /*
        implementação menos direta
        BiFunction<Double, Double, String> resultado2 = (n1, n2) -> {
            double mediaFinal = (n1 + n2) / 2;
            return mediaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado2.apply(2.2, 2.2));
        */

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

        //Usando composição
        System.out.println(media.andThen(conceito).apply(6.2, 8.0));
    }
}
