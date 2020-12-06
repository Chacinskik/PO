package pl.edu.uwm.po.lab12;

import java.util.LinkedList;
import java.util.Stack;

public class lab12 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        for (int i = n - 1; i < pracownicy.size(); i += n - 1) {
            pracownicy.remove(i);
        }
    }

    public static <T> void odwroc(LinkedList<T> pracownicy) {
        LinkedList<T> temp = new LinkedList<T>();
        for (int i = pracownicy.size() - 1; i >= 0; i--) {
            temp.add(pracownicy.get(i));
        }
        for (int i = pracownicy.size() - 1; i >= 0; i--) {
            pracownicy.set(i, temp.get(i));
        }
    }
}

