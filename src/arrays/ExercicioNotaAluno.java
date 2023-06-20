package arrays;

import java.util.Scanner;

public class ExercicioNotaAluno {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantas notas deseja informar: ");
        int qtdNotas = teclado.nextInt();

        double[] arrayNotas = new double[qtdNotas];

        for(int i = 0; i < arrayNotas.length; i++){
            System.out.println("Digite a "+ (i+1) + "ª nota:");
            arrayNotas[i] = teclado.nextDouble();
        }

        double total = 0;
        for(double nota: arrayNotas){
            total += nota;
        }
        
        System.out.println("Média das notas é: " + total/arrayNotas.length);

        teclado.close();
    }
}
