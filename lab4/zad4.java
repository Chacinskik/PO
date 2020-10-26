package pl.edu.uwm.po.lab4;

import java.math.BigInteger;
import java.lang.Math.*;
class zad4 {
    public static BigInteger szachownica(int n){
        int ile_pol=n*n;
        BigInteger suma = new BigInteger("0");
        BigInteger dwojka=new BigInteger("2");
        for (int i=0;i<ile_pol;i++)
        {
            suma=suma.add(dwojka.pow(i));
        }
        return suma;
    }
    public zad4(){
        System.out.println(szachownica(8));
    }
}
