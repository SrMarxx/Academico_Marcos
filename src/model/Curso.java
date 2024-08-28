package model;

public abstract class Curso {
    private String nome;
    private Professor professor;
    private String descricao;

    public Curso(String nome, String descricao, Professor professor) {
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + "\nMinistrado por: " + professor + "\nDescrição: " + descricao;
    }
}
