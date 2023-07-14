package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        Function<String, String> oResultadoEh = valor -> "O resultado é: " + valor;
        
        Function<String, String> empolgado = valor -> valor + "!!!";
        
        System.out.println(parOuImpar.apply(10));
        System.out.println(parOuImpar.apply(11));
        System.out.println(oResultadoEh.apply("teste"));
        String resultadoFinal = parOuImpar.andThen(oResultadoEh).andThen(empolgado).apply(10);
        System.out.println(resultadoFinal);
    }
}
