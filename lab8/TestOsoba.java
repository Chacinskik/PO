package pl.imiajd.chacinski.v2;

import java.time.LocalDate;
import java.util.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"}, LocalDate.parse("1980-12-12"), true, 5000.0, LocalDate.parse("2012-12-12"));
        ludzie[1] = new Student("Małgorzata", new String[]{"Nowak"}, LocalDate.parse("1969-01-01"), false, "Informatyka", 4.25);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}

