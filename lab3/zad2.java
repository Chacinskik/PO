package pl.edu.uwm.po.lab3;
import java.util.Random;

class zad2 {
    public static void generuj (int tab[], int n, int minWartosc, int maxWartosc)
    {
        Random generator = new Random();
        for (int i=0;i<n;i++)
        {
            tab[i]= generator.nextInt(Math.abs(minWartosc)+Math.abs(maxWartosc))-Math.abs(maxWartosc);
        }

    }
    public static int ileNieparzystych(int tablica[])
    {
        int ilosc_nieparzystych=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]%2==1 || tablica[i]%2==-1)
            {
                ilosc_nieparzystych++;
            }
        }
        return ilosc_nieparzystych;
    }
    public static int ileParzystych(int tablica[])
    {
        int ilosc_parzystych=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]%2==0)
            {
                ilosc_parzystych++;
            }
        }
        return ilosc_parzystych;
    }
    public static int ileUDodatnich (int tablica[])
    {
        int ilosc_dodatnie=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]>0)
            {
                ilosc_dodatnie++;
            }
        }
        return ilosc_dodatnie;
    }
    public static int ileUjemnych (int tablica[])
    {
        int ilosc_ujemne=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]<0)
            {
                ilosc_ujemne++;
            }
        }
        return ilosc_ujemne;
    }
    public static int ileZerowe(int tablica[])
    {
        int ilosc_zerowe=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]==0)
            {
                ilosc_zerowe++;
            }
        }
        return ilosc_zerowe;
    }
    public static int ileMaksymalnych(int tablica[])
    {
        int element_najwiekszy=tablica[0];
        int ilosc_elementu_najwiekszego=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]==element_najwiekszy)
            {
                ilosc_elementu_najwiekszego++;
            }
            if (tablica[i]>element_najwiekszy)
            {
                element_najwiekszy=tablica[i];
                ilosc_elementu_najwiekszego=1;
            }
        }
        return ilosc_elementu_najwiekszego;
    }
    public static int sumaDodatnich(int tablica[])
    {
        int suma_dodatnich=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]>0)
            {
                suma_dodatnich+=tablica[i];
            }
        }
        return suma_dodatnich;
    }
    public static int sumaUjemnych(int tablica[])
    {
        int suma_ujemnych=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]<0)
            {
                suma_ujemnych+=tablica[i];
            }
        }
        return suma_ujemnych;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich (int tablica[])
    {
        int najwieksze_combo_dodatnich_temp=0;
        int najwieksze_combo_dodatnich_calosc=0;
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]>0)
            {
                najwieksze_combo_dodatnich_temp++;
            }
            if (tablica[i]<0)
            {
                if (najwieksze_combo_dodatnich_temp>najwieksze_combo_dodatnich_calosc)
                {
                    najwieksze_combo_dodatnich_calosc=najwieksze_combo_dodatnich_temp;
                }
                najwieksze_combo_dodatnich_temp=0;
            }
        }
        return najwieksze_combo_dodatnich_calosc;
    }
    public static void signum(int tablica[])
    {
        for (int i=0;i<tablica.length;i++)
        {
            if (tablica[i]>0)
            {
                tablica[i]=1;
            }
            if (tablica[i]<0)
            {
                tablica[i]=-1;
            }
            System.out.println(tablica[i]);
        }
    }
    public static void odwrocFragment(int tab[], int lewy, int prawy)
    {
        int z=0;
        while ((lewy+prawy)/2!=z)
        {
            tab[tab.length-prawy+z]=tab[tab.length-lewy-z];
            z++;
        }
    }
    public zad2()
    {
        int n=50;
        int tablica[]= new int[n];
        generuj(tablica, n, -999, 999);
        System.out.println("a):");
        System.out.format("Ilosc parzystych: %d, Ilosc nieparzystych: %d\n", ileParzystych(tablica), ileNieparzystych(tablica));
        System.out.println("b):");
        System.out.format("Ilosc dodatnich: %d, Ilosc ujemnych: %d, Ilosc zerowych: %d\n", ileUDodatnich(tablica), ileUjemnych(tablica), ileZerowe(tablica));

        System.out.println("c):");
        System.out.format("Ilosc wystapien maksymalnego: %d\n", ileMaksymalnych(tablica));

        System.out.println("d):");
        System.out.format("Suma dodatnich elementow tablicy: %d, Suma ujemnych elementow tablicy: %d\n", sumaDodatnich(tablica), sumaUjemnych(tablica));

        System.out.println("e):");
        System.out.format("Dlugosc najdluzszego dodatniego fragmentu tablicy to: %d\n", dlugoscMaksymalnegoCiaguDodatnich(tablica));


        System.out.println("f):");
        signum(tablica);

        odwrocFragment(tablica, 2, 8);
        System.out.println("\ng):");
        for (int i=0;i<n;i++)
        {
            System.out.print(tablica[i]);
            System.out.print(", ");
        }
    }
}
