package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 12;
        d1.mes = 6;
        d1.ano = 2023;

        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
        
        Data d2 = new Data();
        d2.dia = 11;
        d2.mes = 6;
        d2.ano = 2023;

        System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);
        
    }
}
