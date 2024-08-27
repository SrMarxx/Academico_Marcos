package model;

public class Professor extends Pessoa{
    private boolean sexo;

    public Professor(String nome, String email, boolean sexo) {
        super(nome, email);
        this.sexo = sexo;
    }

    public String toString() {
        if(sexo == true) {
            return "Sr. " + nome + "\n("+email+")";
        }
        else {
            return "Sra. " + nome + "\n("+email+")";
        }

    }
}