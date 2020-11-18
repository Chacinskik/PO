package pl.imiajd.chacinski.v3;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;
    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    public String toString(){
        return this.getClass().getSimpleName()+"["+this.nazwisko+", "+this.dataUrodzenia.toString()+"]";
    }
    public boolean equals(Object obj){
        Osoba x = (Osoba) obj;
        return this.nazwisko.equals(x.nazwisko) && this.dataUrodzenia.equals(x.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o) {
        return 0;
    }
}
