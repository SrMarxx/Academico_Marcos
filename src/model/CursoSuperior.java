package model;

public class CursoSuperior extends Curso {
    private String ingresso;

    public CursoSuperior(String nome, String descricao,Professor professor, String ingresso) {
        super(nome, descricao, professor);
        this.ingresso = ingresso;
    }
}
