package pl.imiajd.chacinski.v2;

import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }
    public String dzwiek(){
        return "dum dum dum dum DUu u DU DUuu duUDUu duu UDUuu UDUuuD DUUUUU";
    }
}
