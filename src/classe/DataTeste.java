package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        
        Data d2 = new Data(10, 9, 2000);
        
        System.out.println(d1.retornarData());
        System.out.println(d2.retornarData());
        
    }
}
