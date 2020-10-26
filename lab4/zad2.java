package pl.edu.uwm.po.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class zad2 {
    public static int ileRazy(String nazwapliku, char znak) {
        int counter=0;
        try{
            File plik=new File(nazwapliku);
            Scanner czytaj=new Scanner(plik);
            while(czytaj.hasNextLine()){
                String linia=czytaj.nextLine();
                counter+=zad1.countChar(linia, znak);
            }
            czytaj.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Brak pliku o takiej nazwie");
            e.printStackTrace();
        }
        System.out.println(counter);
        return counter;

    }
    public zad2(){
        ileRazy("C:\\Users\\krzys\\IdeaProjects\\lab1\\src\\pl\\edu\\uwm\\po\\lab4\\test.txt", 'e');
    }
}
