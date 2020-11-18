package pl.imiajd.chacinski.v2;

import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;
    public Instrument(String producent, LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }
    public String getProducent(){
        return producent;
    }
    public LocalDate getRokProdukcji(){
        return rokProdukcji;
    }
    public abstract String dzwiek();

    public boolean equals(Object obj){
        return this.toString().equals(obj.toString());
    }
    public String toString(){
        return "Producent: "+producent+"\nrok produkcji: "+rokProdukcji;
    }
}
