package model;

public class Professor extends Pessoa{

    public Professor(String nome, String email, boolean sexo) {
        super(nome, email, sexo);
    }

    public String toString() {
        if(sexo) {
            return "Sr. " + nome + "\n("+email+")";
        }
        else {
            return "Sra. " + nome + "\n("+email+")";
        }

    }
}