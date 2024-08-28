package model;

public abstract class Curso {
    protected String nome;
    protected Professor professor;
    protected String descricao;

    public Curso(String nome, String descricao, Professor professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
    }

    public String getNome() {
        String nomeNovo = String.copyValueOf(nome.toCharArray());
        return nomeNovo;
    }

    public String getProfessor() {
        String professorNovo = String.copyValueOf(professor.getNome().toCharArray());
        return professorNovo;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDescricao() {
        String descricaoNovo = String.copyValueOf(descricao.toCharArray());
        return descricaoNovo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Curso: " + getNome() + "\nMinistrado por: " + getProfessor() + "\nDescrição: " + getDescricao();
    }
}
