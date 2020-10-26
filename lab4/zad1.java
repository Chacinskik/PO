package pl.edu.uwm.po.lab4;

import java.util.Scanner;

class zad1 {
    Scanner scan = new Scanner(System.in);

    public static int countChar(String str, char c){
        int counter=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==c)
            {
                counter+=1;
            }
        }
        return counter;
    }
    public static int countSubstr(String str, String subStr){
        int counter=0;
        String temp;
        for (int i=0;i<=str.length()-subStr.length();i++)
        {
            temp=str.substring(i, subStr.length()+i);
            if (temp.equals(subStr))
            {
                counter+=1;
            }
        }
        return counter;
    }
    public static String middle(String str)
    {
        if(str.length()%2==0)
        {
            return str.substring((str.length()/2)-1, (str.length()/2)+1);
        }
        else {
            return str.valueOf(str.charAt(str.length()/2));
        }
    }

    public zad1(){
        /*
        System.out.println("a) ");
        System.out.println("String: ");
        String str=scan.nextLine();
        System.out.println("Literka: ");
        char c=scan.nextLine().charAt(0);
        System.out.println(countChar(str, c));
        */
        /*
        System.out.println("b) ");
        System.out.println("String: ");
        String str2=scan.nextLine();
        System.out.println("SubStr: ");
        String substr=scan.nextLine();
        System.out.println(countSubstr(str2, substr));
        */
        System.out.println("c) ");
        System.out.println("String: ");
        String str3=scan.nextLine();
        System.out.println(middle(str3));


    }
}
