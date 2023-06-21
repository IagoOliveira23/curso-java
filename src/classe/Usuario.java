package classe;

public class Usuario {
    String nome;
    String email;   

    @Override
    public boolean equals(Object objeto) {
        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;
            Boolean nomeIgual = outro.nome.equals(this.nome);
            Boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
}
