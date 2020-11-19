package pl.imiajd.chacinski.v3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        ArrayList<String> zad3 = new ArrayList<>();
        try {
            File plik = new File("C:/Users/krzys/IdeaProjects/lab1/src/pl/imiajd/chacinski/v3/plik");
            Scanner zczytywanie = new Scanner(plik);
            while (zczytywanie.hasNextLine()) {
                zad3.add(zczytywanie.nextLine());
            }
            zczytywanie.close();
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
            e.printStackTrace();
        }

        System.out.println(zad3);
        Collections.sort(zad3);
        System.out.println(zad3);
    }
}
