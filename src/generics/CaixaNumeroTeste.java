package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        
        Caixa<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(1.2);
        System.out.println(caixaA.abrir());

        Caixa<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(12);
        System.out.println(caixaB.abrir());
    }
}
