package pl.imiajd.chacinski.v2;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet("WarnerBros", LocalDate.parse("2012-12-12")));
        orkiestra.add(new Skrzypce("Stradivarius", LocalDate.parse("2014-11-09")));
        orkiestra.add(new Fortepian("ChopinIndustries", LocalDate.parse("2020-09-12")));
        orkiestra.add(new Flet("WarnerBros", LocalDate.parse("2011-04-12")));
        orkiestra.add(new Flet("WarnerBros", LocalDate.parse("2010-12-15")));
        for (Instrument i: orkiestra){
            System.out.println(i.dzwiek());
        }
        System.out.println(orkiestra);
    }
}
