package pl.imiajd.chacinski;

import java.awt.Rectangle;
public class BetterRectangle extends Rectangle{
    public BetterRectangle(int x, int y, int w, int h)
    {
        this.setLocation(x, y);
        this.setSize(w, h);
    }
    public double getPerimeter()
    {
        return getHeight()*2 + getWidth()*2;
    }
    public double getArea(){
        return getHeight()*getWidth();
    }
}
