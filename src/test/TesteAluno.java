package test;

import model.*;

public class TesteAluno {

    public static void main(String[] args){

        Professor p1 = new Professor("Hilton", "Hilton@gmail.com", true);

        Curso c1 = new CursoTecnico("Math", "Math Programming", p1, "Integrado");

        Aluno a = new Aluno("Joao", "joaogamer@gmail.com",true, c1);

        Aluno b = new Aluno("Maria", "mariazinha@gmail.com",false, c1);

        Aluno c = new Aluno("Jose", "josedamanga@gmail.com",true, c1);

        System.out.println("\n" + a + "\n");

        a.addNota(11.0, 3);

        a.addNota(7.0, 5);

        a.addNota(8.0, 4);

        a.addNota(9.0, 2);

        a.addNota(-10.0, 1);

        System.out.println("Número de avaliações realizadas: " + a.getAvaliacao() + "\nMédia das notas: " + a.getMedia() + "\nSituação: " + a.getSituacao());

        System.out.println("\n" + a.getNotasCre() + "\n");

        System.out.println("\n" + a.getNotasDec() + "\n");
    }

}
