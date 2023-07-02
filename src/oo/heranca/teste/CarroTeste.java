package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Fusca();
        Carro c2 = new Ferrari();

        c1.acelerar();
        c2.acelerar();

        System.out.println("Fusca " + c1.toString());
        System.out.println("Ferrari " + c2.toString());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.frear();

        System.out.println("Fusca " + c1.toString());
        System.out.println("Ferrari " + c2.toString());


    }
}
