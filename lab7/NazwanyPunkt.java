package pl.imiajd.chacinski;


class NazwanyPunkt extends pl.imiajd.chacinski.Punkt
{
    NazwanyPunkt(int x, int y, String name)
    {
        super(x, y);
        this.name = name;
    }

    public void show()
    {
        System.out.println(name + ":<" + x() + ", " + y() + ">");
    }

    private String name;
}