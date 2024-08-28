package model;

import java.util.ArrayList;

public class Registro {
    private ArrayList<Aluno> alunos;

    public Registro() {
        alunos = new ArrayList<Aluno>();
    }
    public void addAluno(Aluno a) {
        alunos.add(a);
    }
    public int getTotalAlunos() {
        return alunos.size();
    }
    public String printAlunos() {
        StringBuilder retorno = new StringBuilder("Lista de Alunos registrados:\n\n");

        for(Aluno a : alunos) {
            retorno.append(a).append("\n\n");
        }

        return retorno.toString();
    }
}
