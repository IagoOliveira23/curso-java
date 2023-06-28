package ooHeranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        j1.x = 0;
        j1.y = 0;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.OESTE);

        System.out.println(j1.y);
        System.out.println(j1.x);
    }
}
