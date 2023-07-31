package generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Ednaldo Pereira");
        resultadoConcurso.adicionar(2, "Maria");
        resultadoConcurso.adicionar(2, "Ana");
        resultadoConcurso.adicionar(3, "Pedro");
        resultadoConcurso.adicionar(4, "Bia");

        System.out.println(resultadoConcurso.getValor(2));
    }
}
