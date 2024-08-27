package model;

public class Nota {

    private float nota;
    private int peso;

    public Nota(float nota, int peso){

        if(nota > 10)
            this.nota = 10;
        else if(nota < 0)
            this.nota = 0;
        else{
            this.nota = nota;
        }

    }

}
