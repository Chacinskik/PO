package pl.edu.uwm.po.lab4;

import java.math.BigDecimal;
import java.lang.Math.*;
import java.math.RoundingMode;

class zad5 {
    public static BigDecimal ile_kapitalu(int k, double p, int n){
        BigDecimal kapital_koncowy=new BigDecimal(String.valueOf(k));
        BigDecimal stopa_procentowa=new BigDecimal(String.valueOf(p));
        for (int i=0;i<n;i++)
        {
            kapital_koncowy=kapital_koncowy.add(kapital_koncowy.multiply(stopa_procentowa));
        }
        return kapital_koncowy.setScale(2, RoundingMode.HALF_UP);
    }
    public zad5(){
        System.out.println(ile_kapitalu(1000, 0.07, 89));
    }
}
