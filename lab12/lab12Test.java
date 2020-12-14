package pl.edu.uwm.po.lab12;

import java.util.LinkedList;

public class lab12Test {
    public static void main(String[] args){
        LinkedList<String> pracownicy = new LinkedList<String>();
        pracownicy.add("Adam");
        pracownicy.add("Błażej");
        pracownicy.add("Cyprian");
        pracownicy.add("Darek");
        pracownicy.add("Edmund");
        lab12.redukuj(pracownicy,2);
        System.out.println(pracownicy);
        lab12.odwroc(pracownicy);
        System.out.println(pracownicy);
        String ala="Ala ma kota. Jej kot lubi myszy.";
        lab12.odwroc(ala);
        lab12.cyfry(2015);
        lab12.primes(10);
        lab12.print(pracownicy);
    }
}
