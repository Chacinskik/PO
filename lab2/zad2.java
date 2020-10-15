package pl.edu.uwm.po.lab2;

import java.util.Scanner;

class zad2 {
    public zad2()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbe naturalna: ");
        int n=scan.nextInt();
        int tablica[]=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Wpisz liczbe rzceczywista: ");
            int liczba=scan.nextInt();
            tablica[i]=liczba;
        }
        int ostatni=tablica[0];
        for (int i=0; i<n;i++)
        {
            if (i==n-1)
            {
                tablica[i]=ostatni;
                break;
            }
            tablica[i]=tablica[i+1];
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(tablica[i]);
        }
    }
}
