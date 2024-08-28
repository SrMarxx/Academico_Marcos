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

    public String getNome() {
        String nomeNovo = String.copyValueOf(this.nome.toCharArray());
        return nomeNovo;

    }

    public String getEmail() {
        String emailNovo = String.copyValueOf(this.email.toCharArray());
        return emailNovo;
    }

    public String getId(){
        return getNome() + "\n("+getEmail()+")";
    }

}
