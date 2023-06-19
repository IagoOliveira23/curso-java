package arrays;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));
        
        notasAlunoA[0] = 10;
        notasAlunoA[1] = 7.3;
        notasAlunoA[2] = 8.5;

        System.out.println(Arrays.toString(notasAlunoA));
        
        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);
    
        //Inicializando o array com os valores
        double[] notasAlunoB = {10, 9, 10, 9};

        double totalAlunoB = 0;
        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

         System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
