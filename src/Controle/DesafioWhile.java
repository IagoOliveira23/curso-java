package Controle;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        double total = 0;
        double nota = 0;
        int cont = 0;

        while(nota != -1){
            System.out.println("Digite a nota: (ou -1 para sair)");
            nota = teclado.nextDouble();
            if(nota >= 0 && nota <= 10){
                total = total + nota;
                cont++;
            }else if(nota != -1) {
                System.out.println("Valor inválido...");
            }

        }


        System.out.println("Somatório: " + total);
        System.out.println("Média: " + total/cont);
        teclado.close();
    }
}
