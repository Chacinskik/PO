package pl.edu.uwm.po.lab11;

public class PairUtilDemo {
    public static void main(String[] args){
        Pair<String> test = new Pair<String>("hehe", "o nieee");
        System.out.println(test.getFirst() + ", " + test.getSecond());
        test.swap();
        System.out.println(test.getFirst() + ", " + test.getSecond());
    }
}
