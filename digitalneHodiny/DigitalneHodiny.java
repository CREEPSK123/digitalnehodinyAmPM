/**
 * Jednoduche digitalne hodiny pracujuce s virtualnym casom.
 * Pamataju si hodiny a minuty.
 */
public class DigitalneHodiny {
    private CiselnyDisplej hodiny;
    private CiselnyDisplej minuty;
    private CiselnyDisplej sekundy;
    private boolean je12hFormat;
    /**
     * Inicializuje digitalne hodiny. Cas zacina plynut od
     * polnoci (00:00).
     */
    public DigitalneHodiny() {
        this.hodiny = new CiselnyDisplej(24, new SegmentovaCislica(-50, 0), new SegmentovaCislica(20, 0));
        this.minuty = new CiselnyDisplej(60, new SegmentovaCislica(90, 0), new SegmentovaCislica(160, 0));
        this.sekundy = new CiselnyDisplej(60, new SegmentovaCislica(230, 0), new SegmentovaCislica(300, 0));
        this.je12hFormat = false;
    }

    /**
     * Vykonava posunutie virtualneho casu o jednu minutu.
     */
    public void tik() {
        this.sekundy.krok();

        if (this.sekundy.getHodnota() == 0) {
            this.minuty.krok();  
        }
        if (this.minuty.getHodnota() == 0) {
            this.minuty.krok();  
        }

    }

    public void zmenFormatcasu(){
        /*if(this.je12hFormat){
        this.je12hFormat = false;
        }  
        else {

        this.je12hFormat = true;
        }*/

        this.je12hFormat = !this.je12hFormat;
    }      

    /**
     * Nastavi virtualny cas na zadanu hodnotu.
     * 
     * @param hodina Hodina na ktoru sa ma cas nastavit.
     * @param minuta Minuta na ktoru sa ma cas nastavit.
     */
    public void setCas(int hodina, int minuta , int sekunda) {
        this.hodiny.setHodnota(hodina);
        this.minuty.setHodnota(minuta);
        this.sekundy.setHodnota(sekunda);
    }

    /**
     * Vrati cas vo forme retazca.
     */
    public String getCas() {
        return this.hodiny.getHodnotaAkoRetazec() + ":" + this.minuty.getHodnotaAkoRetazec() + ";" +  this.sekundy.getHodnotaAkoRetazec();

    }
}
