package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario use1 = new Usuario("teste");
        Usuario use2 = new Usuario("beterraba");
        Usuario use3 = new Usuario("caixa");

        usuarios.add(use1);
        usuarios.add(use2);
        usuarios.add(use3);
        usuarios.add(new Usuario("zebra"));

        System.out.println(usuarios.get(2));

        for(Usuario use: usuarios){
            System.out.println(use);
        }

        usuarios.remove(1);
        System.out.println(usuarios.contains(new Usuario("zebra")));;

    }
}
