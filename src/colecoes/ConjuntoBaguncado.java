package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("abc"); 
        conjunto.add(10);
        conjunto.add('a');

        System.out.println("tamanho: " + conjunto.size());

        conjunto.add(1.2); // repetido
        conjunto.add("abc"); // repetido

        System.out.println("tamanho: " + conjunto.size());
        System.out.println(conjunto.remove('a'));
        System.out.println("tamanho: " + conjunto.size());

        System.out.println(conjunto.contains("abc"));

        Set nums = new HashSet();
        
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1.2);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // união entre os dois conjuntos
        conjunto.retainAll(nums); // interseção entre os dois conjuntos

        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(conjunto);

    }
}
