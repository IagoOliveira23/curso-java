package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        // add e ofter -> adicionam elementos na fila

        fila.add("Ana"); // lança uma exceção, se a fila estiver cheia
        fila.offer("Bia"); // retorna false, se a fila estiver cheia
        fila.offer("Iago");
        fila.offer("Pedro");

        // peek e element -> obter o proximo elemento da fila (sem remover)
        System.out.println(fila.peek()); // retorna nulo, caso não tenha elementos na fila
        System.out.println(fila.element()); // lança uma exceção, caso tenha elementos na fila 

        //fila.size()
        //fila.clear()
        //fila.isEmpy()
        //fila.contains(...)

        //poll e remove -> obter o proximo elemento da fila e remove

        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); // lança uma exceção
      
    }
}
