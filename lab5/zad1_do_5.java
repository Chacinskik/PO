package pl.edu.uwm.po.lab5;

import java.util.ArrayList;

class zad1_do_5 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> wynikowa = new ArrayList<>();
        wynikowa.addAll(a);
        wynikowa.addAll(b);
        return wynikowa;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        int najmniejsza_dlugosc=Math.min(a.size(), b.size());
        int najwieksza_dlugosc=Math.max(a.size(), b.size());
        ArrayList<Integer>wynikowa=new ArrayList<>();
        for (int i=0; i<najmniejsza_dlugosc;i++)
        {
            wynikowa.add(a.get(i));
            wynikowa.add(b.get(i));
        }
        for (int i=najmniejsza_dlugosc; i<najwieksza_dlugosc;i++)
        {
            if (a.size()>b.size())
            {
                wynikowa.add(a.get(i));
            }
            else
            {
                wynikowa.add(b.get(i));
            }
        }
        return wynikowa;
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer>wynikowa=new ArrayList<>();
        int mniejsza=Math.min(a.size(), b.size());
        int wieksza=Math.max(a.size(), b.size());
        int a_index=0;
        int b_index=0;
        while(a_index<a.size()&&b_index<b.size())
        {
            if(a.get(a_index)>=b.get(b_index))
            {
                wynikowa.add(b.get(b_index));
                b_index++;
            }
            else
            {
                wynikowa.add(a.get(a_index));
                a_index++;
            }
        }
        for (int i=mniejsza;i<wieksza;i++)
        {
            if (a.size()>b.size())
            {
                wynikowa.add(a.get(i));
            }
            else
            {
                wynikowa.add(b.get(i));
            }
        }
        return wynikowa;
    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> wynikowa= new ArrayList<>();
        for(int i=a.size()-1;i>=0;i--)
        {
            wynikowa.add(a.get(i));
        }
        return wynikowa;
    }
    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> temp= new ArrayList<>(a);
        int j=0;
        for(int i=temp.size()-1;i>=0;i--) {
            a.set(j,temp.get(i));
            j++;
        }
    }
    public zad1_do_5() {
            ArrayList<Integer> tab1 = new ArrayList<>();
            ArrayList<Integer> tab2 = new ArrayList<>();
            tab1.add(1);
            tab1.add(2);
            tab1.add(8);
            tab1.add(545);
            tab1.add(56465);
            tab2.add(1);
            tab2.add(4);
            tab2.add(13);
            tab2.add(43);
            System.out.println(append(tab1, tab2));
            System.out.println(merge(tab1, tab2));
            System.out.println(mergeSorted(tab1, tab2));
            System.out.println(reversed(tab1));
            reverse(tab1);
            System.out.println(tab1);
        }
    }

