package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro(10, 10);

        Heroi heroi = new Heroi(10, 10);

        System.out.println("Monstro tem: "+ monstro.vida + " de vida");
        System.out.println("Heroi tem: "+ heroi.vida + " de vida");
        
        monstro.andar(Direcao.LESTE);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem: "+ monstro.vida + " de vida");
        System.out.println("Heroi tem: "+ heroi.vida + " de vida");

        monstro.andar(Direcao.SUL);
        heroi.atacar(monstro);

        System.out.println("Monstro tem: "+ monstro.vida + " de vida");
        System.out.println("Heroi tem: "+ heroi.vida + " de vida");
    }
}
