package model;

public class Curso {
    private String nome;
    private Professor professor;
    private String descricao;

    public Curso(String nome, Professor professor, String descricao) {
        this.nome = nome;
        this.professor = professor;
        this.descricao = descricao;
    }

    public String toString() {
        return "Curso: " + nome + "\nMinistrado por: " + professor + "\nDescrição: " + descricao;
    }
}
