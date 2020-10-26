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
    public static String repeat(String str, int n)
    {
        String napis_koncowy="";
        for (int i=0;i<n;i++)
        {
            napis_koncowy=napis_koncowy.concat(str);
        }
        return napis_koncowy;
    }
    public static int[] where(String str, String subStr)
    {
        int [] tab= new int[countSubstr(str, subStr)];
        String temp;
        int counter=0;
        for (int i=0;i<=str.length()-subStr.length();i++)
        {
            temp=str.substring(i, subStr.length()+i);
            if (temp.equals(subStr)) {
                tab[counter] = i;
                counter += 1;
            }
        }
        for (int i=0;i<counter;i++) {
            System.out.println(tab[i]);
        }
        return tab;
    }
    public static String change(String str) {
        StringBuffer zamiana = new StringBuffer();
        for (int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                zamiana.append(String.valueOf(str.charAt(i)).toLowerCase());
            }
            else
            {
                zamiana.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
        }
        return zamiana.toString();
    }
    public static String nice(String str){
        StringBuffer poprawiony = new StringBuffer();
        for (int i=str.length()-1;i>=0;i--)
        {
            poprawiony.append(str.charAt(i));
            if ((i)%3==0&&i!=0)
            {
                poprawiony.append("'");
            }
        }
        return poprawiony.toString();
    }
    public static String nice(String str, String separator, int ile){
        StringBuffer poprawiony = new StringBuffer();
        for (int i=str.length()-1;i>=0;i--)
        {
            poprawiony.append(str.charAt(i));
            if (i%ile==0&&i!=0)
            {
                poprawiony.append(separator);
            }
        }
        return poprawiony.toString();
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
        /*
        System.out.println("c) ");
        System.out.println("String: ");
        String str3=scan.nextLine();
        System.out.println(middle(str3));
        */
        /*
        System.out.println("d) ");
        System.out.println("String: ");
        String str4=scan.nextLine();
        System.out.println(repeat(str4, 3));
        */
        /*
        System.out.println("e) ");
        System.out.println("String: ");
        String str5=scan.nextLine();
        System.out.println("SubStr: ");
        String substr2=scan.nextLine();
        where(str5, substr2);
         */
        /*
        System.out.println("f) ");
        System.out.println("String: ");
        String str6=scan.nextLine();
        System.out.println(change(str6));
        */
        /*
        System.out.println("g) ");
        System.out.println("String: ");
        String str7=scan.nextLine();
        System.out.println(nice(str7));
        */
        System.out.println("h) ");
        System.out.println("String: ");
        String str7=scan.nextLine();
        System.out.println(nice(str7, ".", 4));
    }
}
