package classe;

public class Produto {
    
    String nome;
    double preco;
    double desconto;
    
    Produto(){

    }

    Produto(String nomeInicial){
        nome = nomeInicial;
    }

    Produto(String nomeInicial, double precoInicial, double descInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descInicial;
    }

    double desconto(){
        return preco * (1 - desconto);
    }
}
