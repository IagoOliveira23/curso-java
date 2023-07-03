package oo.encapsulamento;

public class Pessoa {
    private int idade;

    Pessoa(int idade){
        setIdade(idade);
    }

    //Getter
    int getIdade(){
        return idade;
    }

    //Setter
    void setIdade(int idade){
        if(idade >= 0 && idade <= 122){
            this.idade = idade;
        }
    }
}
