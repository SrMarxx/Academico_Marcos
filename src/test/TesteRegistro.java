package test;

import model.*;

public class TesteRegistro {
    public static void main(String[] args) {
        Registro r1 = new Registro();

        Professor p1 = new Professor("Hilton", "Hilton@gmail.com", true);

        Curso c1 = new CursoTecnico("Math", "Math Programming", p1, "Integrado");

        Aluno a = new Aluno("Joao", "joaogamer@gmail.com",true, c1);

        Aluno b = new Aluno("Maria", "mariazinha@gmail.com",false, c1);

        Aluno c = new Aluno("Jose", "josedamanga@gmail.com",true, c1);

        r1.addAluno(a);

        r1.addAluno(b);

        r1.addAluno(c);

        System.out.println("\n" + r1.printAlunos() + "Total de alunos registrados: " + r1.getTotalAlunos());
    }
}
