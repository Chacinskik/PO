package pl.edu.uwm.po.lab3;
import java.util.Scanner;
import java.util.Random;

class zad1{
    public zad1()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę elementow:");
        int n = scan.nextInt();
        int tablica[]= new int[n];
        Random generator = new Random();
        System.out.println("Lewy:");
        int lewy = scan.nextInt();
        System.out.println("Prawy:");
        int prawy = scan.nextInt();

        int ilosc_parzystych=0;
        int ilosc_nieparzystych=0;
        int ilosc_zero=0;
        int ilosc_dodatnie=0;
        int ilosc_ujemne=0;
        int element_najwiekszy=-1000;
        int ilosc_elementu_najwiekszego=0;
        int suma_dodatnich_elementow=0;
        int suma_ujemnych_elementow=0;
        int najwieksze_combo_dodatnich_temp=0;
        int najwieksze_combo_dodatnich_calosc=0;
        for (int i=0; i<n;i++)
        {
            tablica[i]= generator.nextInt(1999)-999;
            //liczniki
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
            if ((tablica[i])%2==0)
            {
                ilosc_parzystych++;
            }
            if (tablica[i]%2==1 || tablica[i]%2==-1)
            {
                ilosc_nieparzystych++;
            }
            if (tablica[i]==0)
            {
                ilosc_zero++;
            }
            if (tablica[i]>0)
            {
                ilosc_dodatnie++;
            }
            if (tablica[i]<0)
            {
                ilosc_ujemne++;
            }
            if (tablica[i]<0)
            {
                suma_ujemnych_elementow+=tablica[i];
            }
            if (tablica[i]>0)
            {
                suma_dodatnich_elementow+=tablica[i];
            }
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
        int[] tablica_nieGMO=tablica.clone();
        int[] tablica_odwrocona=tablica.clone();
        int z=0;
        while ((lewy+prawy)/2!=z)
        {
            tablica_odwrocona[n-prawy+z]=tablica_odwrocona[n-lewy-z];
            z++;
        }
        for (int i=0;i<n;i++)
        {
            //modyfikacja
            if (tablica[i]>0)
            {
                tablica[i]=1;
            }
            if (tablica[i]<0)
            {
                tablica[i]=-1;
            }
        }

        //Output
        System.out.println("a):");
        System.out.format("Ilosc parzystych: %d, Ilosc nieparzystych: %d\n", ilosc_parzystych, ilosc_nieparzystych);

        System.out.println("b):");
        System.out.format("Ilosc dodatnich: %d, Ilosc ujemnych: %d, Ilosc zerowych: %d\n", ilosc_dodatnie, ilosc_ujemne, ilosc_zero);

        System.out.println("c):");
        System.out.format("Najwiekszy element: %d, Ilosc wystapien: %d\n", element_najwiekszy, ilosc_elementu_najwiekszego);

        System.out.println("d):");
        System.out.format("Suma dodatnich elementow tablicy: %d, Suma ujemnych elementow tablicy: %d\n", suma_dodatnich_elementow, suma_ujemnych_elementow);

        System.out.println("e):");
        System.out.format("Dlugosc najdluzszego dodatniego fragmentu tablicy to: %d\n", najwieksze_combo_dodatnich_calosc);

        System.out.println("f):");
        for (int i=0;i<n;i++)
        {
            System.out.print(tablica[i]);
            System.out.print(", ");
        }
        System.out.println("\ng):");
        System.out.println("Tablica przed zmianami: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(tablica_nieGMO[i]);
            System.out.print(", ");
        }
        System.out.println("\nTablica po zmianach: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(tablica_odwrocona[i]);
            System.out.print(", ");
        }

    }
}