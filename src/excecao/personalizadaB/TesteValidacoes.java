package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("ednaldo", 7);
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaDoIntervalo e) {
            System.out.println(e.getMessage());
        }

        try {
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            e.printStackTrace();
        } catch (NumeroForaDoIntervalo | IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("Fim :D");
    }
}
