package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos alunos?");
        int qtdAlunos = teclado.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdNotas = teclado.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total =0;
        for(int i = 0; i < notasDaTurma.length; i++){
            for(int j = 0; j < notasDaTurma[i].length; j++){
                System.out.printf("Informe a %dª nota do aluno %d:", (j+1),(i+1));
                notasDaTurma[i][j] = teclado.nextDouble();
                total += notasDaTurma[i][j];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é: " + media);
        teclado.close();
    }
}
