package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição por valor (tipo primitivo)
        
        System.out.println(a + " " + b);

        Data d1 = new Data(17, 6,2023);
        Data d2 = d1; // atribuição por referência (objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2070;

        System.out.println(d1.retornarData());
        System.out.println(d2.retornarData());

        voltarDataValorPadrao(d1);

        System.out.println(d1.retornarData());
        System.out.println(d2.retornarData());
    
        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
