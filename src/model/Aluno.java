package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa{
    private String nMatricula;
    private Curso curso;
    private ArrayList<Nota> notas;
    private static int numSequencial;
    private static LocalDate dataAtual = LocalDate.of(2024, 4, 9);

    public Aluno(String nome, String email, boolean sexo, Curso curso) {
        super(nome, email, sexo);
        this.nMatricula = geraMatricula();
        this.curso = curso;
        this.notas = new ArrayList<Nota>();
    }

    @Override
    public String toString() {
        return nMatricula + " - " + nome + "\n("+email+")";
    }

    public String getNome() {
        String nomeNovo = String.copyValueOf(this.nome.toCharArray());
        return nomeNovo;
    }
    public String getMatricula() {
        String matriculaNovo = String.copyValueOf(this.nMatricula.toCharArray());
        return matriculaNovo;
    }
    public String getEmail() {
        String emailNovo = String.copyValueOf(this.email.toCharArray());
        return emailNovo;
    }

    private String geraMatricula() {
        if(Aluno.dataAtual.getYear() != LocalDate.now().getYear()) {
            Aluno.numSequencial = 0;
            Aluno.dataAtual = LocalDate.now();
        }
        Aluno.numSequencial++;
        return dataAtual.getYear() + "-" + Aluno.numSequencial;
    }
}
