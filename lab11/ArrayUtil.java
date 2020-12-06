package pl.edu.uwm.po.lab11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> list){
        ArrayList<T>temp = new ArrayList<>(list);
        Collections.sort(temp);
        return list.equals(temp);
    }
    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T obj) {
        int l = 0, r = tab.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (tab.get(m).equals(obj)) {
                return m;
            }
            if (tab.get(m).compareTo(obj) < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab){
        int najw;
        T temp;
        for (int i=tab.size()-1; i>=0 ;i--){
            najw=0;
            for (int j=0; j<=i; j++){
                if (tab.get(najw).compareTo(tab.get(j))<0){
                    najw=j;
                }
            }
            if (najw!=i){
                temp=tab.get(i);
                tab.set(i,tab.get(najw));
                tab.set(najw,temp);
            }
        }
    }
    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> tab) {

        if(tab.isEmpty()){
            return;
        }
        if(tab.size() > 1){
            int mid = tab.size() / 2;
            ArrayList<T>left =  new ArrayList<T>(mid);
            for (int i = 0; i < mid; i++) {
                left.add(tab.get(0));
            }
            for(int i = 0; i < mid; i++){
                left.set(0,tab.get(i));
            }
            ArrayList<T>right = new ArrayList<T>(tab.size()-mid);
            for (int i = 0; i < tab.size()-mid; i++) {
                right.add(tab.get(0));
            }
            for(int i = mid; i < tab.size(); i++){
                right.set(i-mid,tab.get(i));
            }
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.size() && j < right.size()){
                if(left.get(i).compareTo(right.get(j))<0){
                    tab.set(k,left.get(i));
                    i++;
                }
                else{
                    tab.set(k,right.get(j));
                    j++;
                }
                k++;
            }
            while(i < left.size()){
                tab.set(k,left.get(i));
                i++;
                k++;
            }
            while(j < right.size()){
                tab.set(k,right.get(j));
                j++;
                k++;
            }
        }
    }

}
