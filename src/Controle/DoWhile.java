package Controle;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = "";

        do{
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.println("Quer sair? ");
            texto = teclado.nextLine();
        }while(!texto.equalsIgnoreCase("por favor"));
        teclado.close();
    }
}
