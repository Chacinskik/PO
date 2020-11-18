package pl.imiajd.chacinski.v2;

import java.time.LocalDate;

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia)
    {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia=dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    public LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}
