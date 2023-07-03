package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(120);
        p1.setIdade(202);

        System.out.println(p1.getIdade());
    }
}
