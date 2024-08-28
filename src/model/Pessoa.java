package model;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected boolean sexo;

    public Pessoa(String nome, String email, boolean sexo) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
    }
}
