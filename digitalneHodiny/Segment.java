
public class Segment {
    private Obdlznik Obdlznik;
    public Segment(int sirka, int vyska, int x ,int y){
        this.Obdlznik = new Obdlznik();
        this.Obdlznik.zmenStrany (sirka, vyska);
        this.Obdlznik.posunVodorovne (x);
        this.Obdlznik.posunZvisle (y);

    }

    
    public void zobraz () {

        this.Obdlznik.zobraz();
        this.Obdlznik.zmenFarbu ("red");

    }

    public void skry () {
        
        this.Obdlznik.skry();
        this.Obdlznik.zmenFarbu("black");
    }
}
