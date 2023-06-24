package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O Homem que Calculava");
        livros.push("O Andar do Bêbado");

        System.out.println(livros.peek()); // retorna nulo, caso não tenha elementos na fila
        System.out.println(livros.element()); // lança exceção, caso não tenha elementos na fila

        System.out.println(livros.poll()); // retorna nulo
        System.out.println(livros.remove()); // lança exceção
        System.out.println(livros.pop()); // lança exceção
              
        // livros.size();
        // livros.clear();
        // livros.contains(...);
        // livros.isEmpty();
    }
}
