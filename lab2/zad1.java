package pl.edu.uwm.po.lab2;

import java.util.Scanner;

import static java.lang.Math.*;


class zad1 {
    public static int silnia (int n) {
        int iloczyn = 1;
        for (int i=1; i<=n; i++) {
            iloczyn *= i;
        }
        return iloczyn;
    }
    public zad1(){
        //deklaracje
        int suma = 0;
        int iloczyn = 1;
        int suma_abs=0;
        int suma_sqrt=0;
        int iloczyn_abs=1;
        int suma_kwadratow=0;
        int suma_minusplus=0;
        float zad_i=0;
        //n
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz ilosc akcji: ");
        String liczba=scan.nextLine();
        //wypisywanie
        for(int i=0;i<Integer.valueOf(liczba);i++)
        {
            System.out.println("Wpisz liczbe do akcji: ");
            Integer liczba2=scan.nextInt();
            suma+=liczba2;
            iloczyn*=liczba2;
            suma_abs+=abs(liczba2);
            suma_sqrt+=sqrt(abs(liczba2));
            iloczyn_abs*=abs(liczba2);
            suma_kwadratow+=pow(liczba2, 2);
            suma_minusplus+=(liczba2*(pow(-1, (i+2))));
            zad_i+=((liczba2*(pow(-1, (i+1))))/silnia(i+1));
        }
        //output
        System.out.println("a)");
        System.out.println(suma);
        System.out.println("b)");
        System.out.println(iloczyn);
        System.out.println("c)");
        System.out.println(suma_abs);
        System.out.println("d)");
        System.out.println(suma_sqrt);
        System.out.println("e)");
        System.out.println(iloczyn_abs);
        System.out.println("f)");
        System.out.println(suma_kwadratow);
        System.out.println("g)");
        System.out.format("%d, %d\n", suma, iloczyn);
        System.out.println("h)");
        System.out.println(suma_minusplus);
        System.out.println("i)");
        System.out.println(zad_i);
    }
}
