package pl.imiajd.chacinski.v2;

import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    public String dzwiek(){
        return "io Io IO i i i i o III i IO iiii O iiiii O iiii O iiiii O Ioo iO";
    }
}
