package Padroes.observer;

public class AniversarioSurpresa {
    public static void main(String[] args) {
        Amigos amigos = new Amigos();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservadores(amigos);
        porteiro.monitorar();
    }
}
