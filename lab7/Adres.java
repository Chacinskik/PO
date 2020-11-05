package pl.imiajd.chacinski;

public class Adres {

    private String ulica;
    private int nr_domu;
    private int nr_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int nr_domu, int nr_mieszkania, String miasto, String kod_pocztowy)
    {
        this.ulica=ulica;
        this.nr_domu=nr_domu;
        this.nr_mieszkania=nr_mieszkania;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    public Adres(String ulica, int nr_domu, String miasto, String kod_pocztowy)
    {
        this.ulica=ulica;
        this.nr_domu=nr_domu;
        this.nr_mieszkania= 0;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    public void pokaz()
    {
        System.out.format("%s, %s\n", this.kod_pocztowy, this.miasto);
        if (this.nr_mieszkania!=0)
        {
            System.out.format("%s %d/%d", this.ulica, this.nr_domu, this.nr_mieszkania);
        }
        else
        {
            System.out.format("%s %d", this.ulica, this.nr_domu);
        }
    }
    public boolean przed(Adres inny)
    {
        for (int i=0; i<inny.kod_pocztowy.length();i++)
        {
            if (inny.kod_pocztowy.charAt(i)>this.kod_pocztowy.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
