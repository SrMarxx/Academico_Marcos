package model;

import exeptions.OutRangeExeption;

public class Nota {

    private float nota;
    private int peso;

    public Nota(float nota, int peso) throws OutRangeExeption {

        if(nota > 10)
            throw new OutRangeExeption("Nota não pode ser maior que 10");
        else if(nota < 0)
            throw new OutRangeExeption("Nota não pode ser menor que 0");
        else{
            this.nota = nota;
        }

    }

}
