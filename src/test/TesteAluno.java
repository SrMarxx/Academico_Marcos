package test;

import model.Aluno;

public class TesteAluno {

    public static void main(String[] args){

        Aluno a = new Aluno("Joao", "joaogamer@gmail.com", 123123);

        System.out.println("\nAluno: " + a);

        Aluno b = new Aluno(a);

        b.setEmail("joao43123123@gmail.com");

        System.out.println("\nAluno: " + a);

        System.out.println("\nO e-mail do aluno não foi alterado mesmo após alterar a cópia.");

    }

}
