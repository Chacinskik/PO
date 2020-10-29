package pl.edu.uwm.po.lab6;

public class IntegerSet {
    private boolean[] tab;
    public IntegerSet(){
        this.tab=new boolean[100];
    }
    public static IntegerSet union(IntegerSet zbior1, IntegerSet zbior2)
    {
        IntegerSet wynik=new IntegerSet();
        for (int i=0;i<100;i++)
        {
            if(zbior1.tab[i]||zbior2.tab[i])
            {
                wynik.tab[i]=true;
            }
        }
        return wynik;
    }
    public static IntegerSet intersection(IntegerSet zbior1, IntegerSet zbior2)
    {
        IntegerSet wynik=new IntegerSet();
        for (int i=0;i<100;i++)
        {
            if(zbior1.tab[i]&&zbior2.tab[i])
            {
                wynik.tab[i]=true;
            }
        }
        return wynik;
    }
    public void insertElement(int n)
    {
        this.tab[n-1]= true;
    }
    public void deleteElement(int n)
    {
        this.tab[n-1]= false;
    }
    public String toString()
    {
        StringBuilder wynik=new StringBuilder();
        for (int i=0;i<100;i++)
        {
            if(this.tab[i]){
                wynik.append(i+1+" ");
            }
        }
        return wynik.toString();
    }
    public boolean equals(IntegerSet zbior2)
    {
        return this.toString().equals(zbior2.toString());
    }
}
