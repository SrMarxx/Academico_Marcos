package model;

public class Aluno extends Pessoa{
    private int nMatricula;
    private Curso curso;

    public Aluno(String nome, String email, boolean sexo, int nMatricula, Curso curso) {
        super(nome, email, sexo);
        this.nMatricula = nMatricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return nMatricula + " - " + nome + "\n("+email+")";
    }
}
