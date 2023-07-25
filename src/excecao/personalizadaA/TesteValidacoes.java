package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("ednaldo", -7);
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaDoIntervalo e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :D");
    }
}
