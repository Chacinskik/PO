package pl.imiajd.chacinski.v3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args){
        ArrayList<Student> grupa = new ArrayList<>();
        grupa.add(new Student("Chaciński", LocalDate.parse("2000-09-24"), 4.23));
        grupa.add(new Student("Black", LocalDate.parse("1980-01-02"), 3.22));
        grupa.add(new Student("Gass", LocalDate.parse("1980-07-02"), 2.34));
        grupa.add(new Student("Mickiewicz", LocalDate.parse("1980-01-02"), 4.87));
        grupa.add(new Student("Black", LocalDate.parse("1979-12-05"),3.99));
        grupa.add(new Student("Black", LocalDate.parse("1979-12-05"),5.00));
        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
