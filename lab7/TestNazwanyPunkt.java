package pl.imiajd.chacinski;

public class TestNazwanyPunkt
{
    public static void main(String[] args)
    {
        pl.imiajd.chacinski.NazwanyPunkt a = new pl.imiajd.chacinski.NazwanyPunkt(3, 5, "port");
        a.show();

        pl.imiajd.chacinski.Punkt b = new pl.imiajd.chacinski.Punkt(3, 5);
        b.show();

        pl.imiajd.chacinski.Punkt c = new pl.imiajd.chacinski.NazwanyPunkt(3, 6, "tawerna");
        c.show();

        //a = b;               //  --- powoduje błąd kompilacji  (dlaczego ?)
        //a = (NazwanyPunkt) b;  //   --- powoduje błąd wykonania   (dlaczego ?)

        //a = c;                 //--- powoduje błąd kompilacji  (dlaczego ?)
        a = (pl.imiajd.chacinski.NazwanyPunkt) c;
        a.show();
    }
}