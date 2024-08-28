package model;

public class CursoTecnico extends Curso {
    private String modalidade;

    public CursoTecnico(String nome, String descricao,Professor professor , String modalidade) {
        super(nome, descricao, professor);
        this.modalidade = modalidade;
    }
}
