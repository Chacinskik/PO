package pl.edu.uwm.po.lab6;

public class TestIntegerSet {
    public static void main(String[] args)
    {
        IntegerSet spr1=new IntegerSet();
        IntegerSet spr2=new IntegerSet();

        spr1.insertElement(1);
        spr1.insertElement(2);
        spr1.insertElement(4);
        spr1.insertElement(8);
        spr2.insertElement(1);
        spr2.insertElement(3);
        spr2.insertElement(9);
        spr2.insertElement(27);

        System.out.println(IntegerSet.union(spr1, spr2).toString());
        System.out.println(IntegerSet.intersection(spr1, spr2).toString());
        System.out.println(spr1.equals(spr2));
    }
}
