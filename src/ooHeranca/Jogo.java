package ooHeranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 10;

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
