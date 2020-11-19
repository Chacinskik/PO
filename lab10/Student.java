package pl.imiajd.chacinski.v3;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    private double sredniaOcen;
    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }
    public String toString(){
        return this.getClass().getSimpleName() + " nazwisko: " + getNazwisko()+ " Data urodzenia: " + getDataUrodzenia().toString() + " srednia: " + this.sredniaOcen;
    }
    public int compareTo(Osoba s){
        int student_comparision = super.compareTo(s);
        if (student_comparision == 0 && s instanceof Student){
            if (this.sredniaOcen > ((Student) s).sredniaOcen){
                return 1;
            }
            if (this.sredniaOcen == ((Student) s).sredniaOcen){
                return 0;
            }
            if (this.sredniaOcen < ((Student) s).sredniaOcen){
                return -1;
            }
        }
        return student_comparision;
    }

}
