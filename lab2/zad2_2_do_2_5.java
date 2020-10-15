package pl.edu.uwm.po.lab2;

import java.util.Scanner;

class zad2_2_do_2_5 {
    public zad2_2_do_2_5()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbe naturalna: ");
        int n=scan.nextInt();
        int tablica[]= new int[n];
        int zad2_2=0;
        int liczba_dodatnich=0;
        int liczba_ujemnych=0;
        int liczba_zer=0;
        int zad_2_5=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Wpisz liczby naturalne: ");
            int liczba=scan.nextInt();
            tablica[i]=liczba;
        }
        int najwieksze=tablica[0];
        int najmniejsze=tablica[0];
        for (int i=0;i<n;i++)
        {
            if (tablica[i]>0)
            {
                zad2_2+=2*tablica[i];
                liczba_dodatnich+=1;
            }
            if (tablica[i]==0)
            {
                liczba_zer+=1;
            }
            if (tablica[i]<0)
            {
                liczba_ujemnych+=1;
            }
            if (najwieksze<tablica[i])
            {
                najwieksze=tablica[i];
            }
            if (najmniejsze>tablica[i])
            {
                najmniejsze=tablica[i];
            }
        }
        for (int i=0;i<n-1;i++)
        {
            if (tablica[i]>0&&tablica[i+1]>0)
            {
                zad_2_5+=1;
            }
        }
        System.out.println("2_2: ");
        System.out.println(zad2_2);
        System.out.println("2_3: ");
        System.out.format("Dodatnie: %d, Ujemne: %d, Zero: %d", liczba_dodatnich, liczba_ujemnych, liczba_zer);
        System.out.println("2_4: ");
        System.out.format("Najwieksza: %d, Najmniejsza: %d\n", najwieksze, najmniejsze);
        System.out.println("2_5: ");
        System.out.println(zad_2_5);
    }
}
