package pl.imiajd.chacinski;

public class Test {
    public static void main(String args[])
    {
        BetterRectangle figura=new BetterRectangle(3,3, 4, 5);
        System.out.println(figura.getArea());
        System.out.println(figura.getPerimeter());
        System.out.println(figura.getHeight());
        Nauczyciel tea=new Nauczyciel("Kowalski", "1970", 7000);
        System.out.println(tea.getPensja());
        System.out.println(tea.toString());
    }
}
