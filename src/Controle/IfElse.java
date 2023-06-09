package Controle;
import javax.swing.JOptionPane;

class IfElse{
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite o número");
        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
           System.out.println("Número par!");
        }else{
            System.out.println("Número impar!");
        }
    }
}