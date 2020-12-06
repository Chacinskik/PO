package pl.edu.uwm.po.lab11;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayUtilTest {
    public static void main(String[] args){
        ArrayList<Integer> test_i = new ArrayList<>();
        test_i.add(1);
        test_i.add(3);
        test_i.add(2);
        System.out.println(ArrayUtil.isSorted(test_i));
        ArrayList<LocalDate> test_ld = new ArrayList<>();
        test_ld.add(LocalDate.parse("1970-02-03"));
        test_ld.add(LocalDate.parse("1960-01-01"));
        test_ld.add(LocalDate.parse(("2020-03-05")));
        System.out.println(ArrayUtil.isSorted(test_ld));
        System.out.println(ArrayUtil.binSearch(test_i,2));
        System.out.println(ArrayUtil.binSearch(test_ld,LocalDate.parse("2020-03-05")));
        System.out.println(ArrayUtil.binSearch(test_ld,LocalDate.parse("2018-03-05")));
        ArrayUtil.selectionSort(test_i);
        ArrayUtil.mergeSort(test_ld);
        System.out.println(test_i);
        System.out.println(test_ld);

    }
}
