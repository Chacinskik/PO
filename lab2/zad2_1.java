package pl.edu.uwm.po.lab2;

import java.util.Scanner;

class zad2_1 {
    public static int silnia (int n) {
        int iloczyn = 1;
        for (int i = 1; i <= n; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }
    public zad2_1()
    {
        //liczniki
        int ilosc_liczb_nieparzystych=0;
        int ilosc_podzielne_przez_3_nie_przez_5=0;
        int ilosc_kwadratow=0;
        int ilosc_d=0;
        int ilosc_e=0;
        int ilosc_f=0;
        int ilosc_nieparzyste_nieujemne=0;
        int ilosc_h=0;
        int podwojona_suma_jesli_dodatnie=0;
        //ilosc elementow
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbe naturalna: ");
        int n=scan.nextInt();
        //wpisywanie
        int tablica[]= new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Wpisz liczby naturalne: ");
            int liczba=scan.nextInt();
            tablica[i]=liczba;
        }
        for (int i=0;i<n;i++)
        {
            //warunki
            if(tablica[i]%2==1)
            {
                ilosc_liczb_nieparzystych+=1;
            }
            if (tablica[i]%3==0&&tablica[i]%5!=0)
            {
                ilosc_podzielne_przez_3_nie_przez_5+=1;
            }
            if (Math.sqrt(tablica[i])%1==0)
            {
                ilosc_kwadratow+=1;
            }
            if(i>1&&i<n-1)
            {
                if(tablica[i]<((tablica[i-1]+tablica[i+1])/2))
                {
                    ilosc_d+=1;
                }
            }
            if (tablica[i]>Math.pow(2, i+1)&&tablica[i]<silnia(i+1))
            {
                ilosc_e+=1;
            }
            if ((i+1)%2==1 && tablica[i]%2==0)
            {
                ilosc_f+=1;
            }
            if(tablica[i]%2==1&&tablica[i]>=0)
            {
                ilosc_nieparzyste_nieujemne+=1;
            }
            if (Math.abs(tablica[i])<i*i)
            {
                ilosc_h+=1;
            }
        }
        System.out.println("a)");
        System.out.println(ilosc_liczb_nieparzystych);
        System.out.println("b)");
        System.out.println(ilosc_podzielne_przez_3_nie_przez_5);
        System.out.println("c)");
        System.out.println(ilosc_kwadratow);
        System.out.println("d)");
        System.out.println(ilosc_d);
        System.out.println("e)");
        System.out.println(ilosc_e);
        System.out.println("f)");
        System.out.println(ilosc_f);
        System.out.println("g)");
        System.out.println(ilosc_nieparzyste_nieujemne);
        System.out.println("h)");
        System.out.println(ilosc_h);
    }
}
