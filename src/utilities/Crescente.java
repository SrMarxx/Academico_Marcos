package utilities;

import model.Nota;

import java.util.Comparator;

public class Crescente implements Comparator{
    public int compare(Object o1, Object o2) {
        Nota n1 = (Nota) o1;
        Nota n2 = (Nota) o2;

        if(n1.getNota() > n2.getNota()){
            return 1;

        }
        else if(n1.getNota() < n2.getNota()){
            return -1;
        }
        return 0;
    }
}
