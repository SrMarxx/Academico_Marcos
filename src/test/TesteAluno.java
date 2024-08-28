package test;

import model.Aluno;
import model.Curso;
import model.CursoTecnico;
import model.Professor;

public class TesteAluno {

    public static void main(String[] args){

        Professor p1 = new Professor("Hilton", "Hilton@gmail.com", true);

        Curso c1 = new CursoTecnico("Math", "Math Programming", p1, "Integrado");

        Aluno a = new Aluno("Joao", "joaogamer@gmail.com",true, c1);

        System.out.println("\nAluno: " + a + "\n");

        a.addNota(11.0, 3);

        a.addNota(7.0, 5);

        a.addNota(8.0, 4);

        a.addNota(9.0, 2);

        a.addNota(-10.0, 1);

        System.out.println("Número de avaliações realizadas: " + a.getAvaliacao() + "\nMédia das notas: " + a.getMedia() + "\nSituação: " + a.getSituacao());
    }

}
