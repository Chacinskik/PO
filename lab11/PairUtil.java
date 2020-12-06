package pl.edu.uwm.po.lab11;

public class PairUtil<T> {
    public static <T> Pair<T> swap(Pair<T> para){
        Pair<T> wparka = new Pair<T>(para.getFirst(), para.getSecond());
        wparka.swap();
        return wparka;
    }
}
