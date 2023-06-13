package classe;

public class Produto {
    
    String nome;
    double preco;
    double desconto;

    double desconto(){
        return preco * (1 - desconto);
    }
}
