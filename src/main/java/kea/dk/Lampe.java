package kea.dk;

public class Lampe {

    private String navn;
    private boolean tændt;

    public Lampe(String navn, boolean tændt){
        this.navn=navn;
        this.tændt =tændt;

    }
    public Lampe (String navn){
        this.navn=navn;
        this.tændt=false;
    }
    public void turnon(){
        tændt =true;
    }
    public void turnOff() {
        tændt = false;
    }
    public void toggel(){
        if (tændt==true){
            turnOff();
        }else turnon();
    }public boolean isOn (){
        return tændt;
}
public String toString(){
        String text;
        if (tændt)
            text=" tændt";
        else text =" slukket";
        return navn + "er"+text;
}

        }
