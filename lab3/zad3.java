package pl.edu.uwm.po.lab3;

import java.util.Scanner;
import java.util.Random;

class zad3 {
    public zad3()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("m, n, k...:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();

        int tablica[]= new int[m*n];
        int tablica2[]= new int[n*k];
        int tablica3[]= new int[m*n];

        Random generator = new Random();

        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                tablica[(i*m)+j]= generator.nextInt(10)+1;
                System.out.print(tablica[(i*m)+j]);
                System.out.print(", ");
            }
            System.out.println("\n");
        }
        System.out.println("===============");
        for (int a=0;a<n;a++)
        {
            for (int b=0;b<k;b++)
            {
                tablica2[(a*n)+b]= generator.nextInt(10)+1;
                System.out.print(tablica2[(a*n)+b]);
                System.out.print(", ");
            }
            System.out.println("\n");
        }
    }
}
