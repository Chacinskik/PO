package pl.imiajd.chacinski;

public class Nauczyciel extends Osoba{
    private int pensja;
    public Nauczyciel(String nazwisko, String rokUrodzenia, int pensja)
    {
        super(nazwisko, rokUrodzenia);
        this.pensja=pensja;
    }
    public int getPensja()
    {
        return this.pensja;
    }
    public String toString()
    {
        return getNazwisko()+" "+ getRokUrodzenia()+" "+getPensja();
    }
}
