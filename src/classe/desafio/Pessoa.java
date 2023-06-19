package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    void comer(Comida a){
        if(a != null){
            this.peso += + a.peso;
        }
    }

    String falar(){
        return "Eu me chamo " + nome + " e peso: " + peso + "Kg.";
    }
}
