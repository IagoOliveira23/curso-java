package classe;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "Ednaldo Pereira";
        u1.email = "banido@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Ednaldo Pereira";
        u2.email = "banido@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(new Date()));
    }
}
