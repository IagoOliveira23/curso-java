package oo.heranca.desafio;

public class Ferrari extends Carro {

    Ferrari(){
        super(315);
    }
    
    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
    }

    void acelerar(){
        velocidade += 15;
    }
}
