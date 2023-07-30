package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Java", "C", "C++", "C#");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        //Método 1
        String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem1);

        Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero1);

        //Método 2
        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);


    }
    
}
