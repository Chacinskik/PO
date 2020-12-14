package pl.edu.uwm.po.lab12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class lab12 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        for (int i = n - 1; i < pracownicy.size(); i += n - 1) {
            pracownicy.remove(i);
        }
    }

    public static <T> void odwroc(LinkedList<T> pracownicy) {
        LinkedList<T> temp = new LinkedList<>();
        for (int i = pracownicy.size() - 1; i >= 0; i--) {
            temp.add(pracownicy.get(i));
        }
        for (int i = pracownicy.size() - 1; i >= 0; i--) {
            pracownicy.set(i, temp.get(i));
        }
    }
    public static <T> void odwroc(String zdanie){
        Stack<String> stack = new Stack<String>();
        String[] sentences = zdanie.split("\\. ");
        zdanie = "";
        for (int i = 0; i < sentences.length; i++) {
            sentences[i]=sentences[i].toLowerCase();
            for (int j = 0; j < sentences[i].length(); j++) {
                if(sentences[i].charAt(j)=='.'){
                    sentences[i] = sentences[i].substring(0, sentences[i].length()-1);
                }
            }
            String[] words = sentences[i].split(" ");
            for (int k = 0; k < words.length; k++) {
                if(k== words.length-1){
                    words[words.length-1] = words[words.length-1].substring(0, 1).toUpperCase() + words[words.length-1].substring(1);
                }
                if(k==0){
                    words[0]=words[0]+'.';
                }
                stack.push(words[k]);
            }
            int rozmiar = stack.size();
            for (int l = 0; l < rozmiar; l++) {
                zdanie=zdanie+stack.pop()+" ";
            }
        }
        System.out.println(zdanie);
    }

    public static void cyfry (int n){
        Stack<Integer> stack = new Stack<Integer>();
        String ileLiczb=String.valueOf(n);
        for (int i = ileLiczb.length(); i > 0; i--) {
            stack.push(n%10);
            n=n/10;
        }
        int ilosc = stack.size();
        for (int i = 0; i< ilosc; i++) {
            System.out.println(stack.pop());
        }
    }
    public static void primes (int n){
        ArrayList<Integer> tab = new ArrayList<Integer>(n-1);
        for (int i = 2; i < n; i++) {
            tab.add(i);
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            int l = i;
            tab.removeIf(k -> (k % l == 0));
        }
        System.out.println(tab);
    }
    public static <T extends Iterable<?>> void print(T Obiekt ){
        Iterator<?> iter = Obiekt.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next());
            if (iter.hasNext()){
                System.out.print(", ");
            }
        }
    }

}


