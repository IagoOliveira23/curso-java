package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("João"));
        usuarios.add(new Usuario("Ednaldo"));
        usuarios.add(new Usuario("Ana"));

        boolean resultado = usuarios.contains(new Usuario("Ednaldo"));
        System.out.println(resultado);


    }
}
