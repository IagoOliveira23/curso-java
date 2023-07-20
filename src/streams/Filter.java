package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ednaldo", 10);
        Aluno a2 = new Aluno("Cássio", 10);
        Aluno a3 = new Aluno("Ana", 10);
        Aluno a4 = new Aluno("João", 7.5);
        Aluno a5 = new Aluno("Bia", 4.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

        //alunos.stream().filter(a -> a.nota >= 7).map(a -> "Parabéns " + a.nome + " você foi aprovado(a)!").forEach(System.out::println);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> mensagemAprovado = a -> "Parabéns " + a.nome + " você foi aprovado(a)!!";

        //refatorado
        alunos.stream().filter(aprovado).map(mensagemAprovado).forEach(System.out::println);
    }
}
