package pl.imiajd.chacinski.v3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Chaciński", LocalDate.parse("2000-09-24")));
        grupa.add(new Osoba("Black", LocalDate.parse("1980-01-02")));
        grupa.add(new Osoba("Gass", LocalDate.parse("1980-07-02")));
        grupa.add(new Osoba("Mickiewicz", LocalDate.parse("1980-01-02")));
        grupa.add(new Osoba("Black", LocalDate.parse("1979-12-05")));
        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
