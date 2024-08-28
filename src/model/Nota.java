package model;

import exeptions.OutRangeExeption;

public class Nota {

    private double nota;
    private int peso;

    public Nota(double nota, int peso) throws OutRangeExeption {

        if(nota > 10)
            throw new OutRangeExeption("Nota não pode ser maior que 10");
        else if(nota < 0)
            throw new OutRangeExeption("Nota não pode ser menor que 0");
        else{
            this.nota = nota;
            this.peso = peso;
        }

    }

    public double getNota() {
        double notaNovo = this.nota;
        return notaNovo;
    }
    public int getPeso() {
        int pesoNovo = this.peso;
        return pesoNovo;
    }

}
