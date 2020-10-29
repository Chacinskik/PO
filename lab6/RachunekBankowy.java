package pl.edu.uwm.po.lab6;

public class RachunekBankowy {
    public static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double saldo)
    {
        this.saldo=saldo;
    }
    public double obliczMiesieczneOdsetki()
    {
        this.saldo+=(this.saldo*rocznaStopaProcentowa)/12;
        return (this.saldo*rocznaStopaProcentowa)/12;
    }
    public static void setRocznaStopaProcentowa(double nowarocznaStopaProcentowa)
    {
        rocznaStopaProcentowa=nowarocznaStopaProcentowa;
    }
    public double getSaldo()
    {
        return this.saldo;
    }
}
