package pl.imiajd.chacinski;

public class Student extends Osoba{
    private String kierunek;
    public Student(String nazwisko, String rokUrodzenia, String kierunek)
    {
        super(nazwisko, rokUrodzenia);
        this.kierunek=kierunek;
    }
    public String getKierunek(){
        return this.kierunek;
    }
    public String toString()
    {
        return getNazwisko()+" "+ getRokUrodzenia()+" "+getKierunek();
    }
}
