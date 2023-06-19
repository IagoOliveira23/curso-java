package classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("lasanha", 0.500);
        Comida c2 = new Comida("Pastel", 0.100);
        
        Pessoa p1 = new Pessoa("ednaldo pereira", 112);
        
        System.out.println(p1.falar());
        
        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c1);

        System.out.println(p1.falar());
    }
}
