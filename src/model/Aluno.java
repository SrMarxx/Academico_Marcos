package model;

import exeptions.OutRangeExeption;
import utilities.Crescente;
import utilities.Decrescente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

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
        if (sexo){
            return getMatricula() + " - Aluno: " + getId();
        }
        return getMatricula() + " - Aluna: " + getId();
    }

    public String getMatricula() {
        String matriculaNovo = String.copyValueOf(this.nMatricula.toCharArray());
        return matriculaNovo;
    }

    public void addNota(double nota, int peso) {
        try{
            Nota novo = new Nota(nota, peso);
            notas.add(novo);
            System.out.println("Nota adicionada com sucesso!\n");
        }catch (OutRangeExeption e){
            System.out.println("Erro ao adicionar nota:\n" + e.getMessage() + "\n");
        }

    }

    public int getAvaliacao() {
        return notas.size();
    }

    public double getMedia() {
        int peso = 0;
        double val = 0;
        if(notas.isEmpty()) {
            return 0.0;
        }
        for(Nota n: notas) {
            peso = peso + n.getPeso();
            val = val + (n.getNota() * n.getPeso());
        }

        return arredondar((val / peso));
    }

    public String getSituacao() {
        double val = this.getMedia();
        if(notas.isEmpty()) {
            return "Aluno sem avaliação.";
        }
        else if(val < 6) {
            return "Aluno reprovado";
        }
        else {
            return "Aluno aprovado";
        }
    }

    public String getNotasCre(){
        Crescente crescente = new Crescente();
        Collections.sort(notas, crescente);

        StringBuilder retorno = new StringBuilder("Lista de notas em ordem crescente:\n\n");

        for(Nota a : notas) {
            retorno.append(a.getNota()).append("\n\n");
        }
        return retorno.toString();
    }

    public String getNotasDec(){
        Decrescente decrescente = new Decrescente();
        Collections.sort(notas, decrescente);

        StringBuilder retorno = new StringBuilder("Lista de notas em ordem decrescente:\n\n");

        for(Nota a : notas) {
            retorno.append(a.getNota()).append("\n\n");
        }
        return retorno.toString();
    }

    private String geraMatricula() {
        if(Aluno.dataAtual.getYear() != LocalDate.now().getYear()) {
            Aluno.numSequencial = 0;
            Aluno.dataAtual = LocalDate.now();
        }
        Aluno.numSequencial++;
        return dataAtual.getYear() + "-" + Aluno.numSequencial;
    }

    private static double arredondar(double media) {
        return Math.round(media * 100.0)/100.0;
    }

}
