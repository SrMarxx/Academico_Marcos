package model;

public class Aluno extends Pessoa{
    private int nMatricula;

    public Aluno(String nome, String email, int nMatricula) {
        super(nome, email);
        this.nMatricula = nMatricula;
    }

    public Aluno(Aluno aluno){
        this(aluno.nome, aluno.email, aluno.nMatricula);
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return nMatricula + " - " + nome + "\n("+email+")";
    }
}
