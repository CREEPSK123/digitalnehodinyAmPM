/**
 * Trieda reprezentujuca jeden ciselny displej v digitalnych hodinach.
 * Stara sa o zmenu hodnoty v zadanych hraniciach a o formatovanie
 * cisla do tvaru dvojcifernej hodnoty.
 */
public class CiselnyDisplej {
    private int hornaHranica;
    private int hodnota;
    private SegmentovaCislica desiatky;
    private SegmentovaCislica jednotky;
    private boolean je12hformat = true;
    
    /**
     * Inicializuje ciselny displej na hodnotu 0. Horna hranica sa pouzije
     * ta, co zada pouzivatel v parametri.
     * @param pthis.hornaHranica Predstavuje cislo, ktore hodnota ciselneho
     * displeja nemoze dosiahnut.
     */
    public CiselnyDisplej(int hornaHranica, SegmentovaCislica desiatky, SegmentovaCislica jednotky) {
        this.hornaHranica = hornaHranica;
        this.hodnota = 0;
        
        this.desiatky = desiatky;
        this.jednotky = jednotky;
    }

    public void zobraz() {
        je12hformat = true;
        desiatky.zobraz(12);
        jednotky.zobraz(60);
    }

    public void skry() {
        je12hformat = false;
        desiatky.skry();
        jednotky.skry();
    }

    public boolean je12hformat() {
        return this.je12hformat;
    }
    
    /**
     * Vrati aktualnu hodnotu ciselneho displeja vo forme celeho cisla typu
     * int.
     */
    public int getHodnota() {
        return this.hodnota;
    }
    
    /**
     * Nastavi novu hodnotu ciselneho displeja vo forme celeho cisla typu int.
     * Kontroluje platnost zadavaneho cisla. V pripade, ze je mimo rozsah,
     * nechava povodnu hodnotu.
     * 
     * @param hodnota hodnota, ktora sa ma nastavit.
     */
    public void setHodnota(int hodnota) {
        if (hodnota >= 0 && hodnota < this.hornaHranica) {
            this.hodnota = hodnota;
            
            if (this.desiatky != null && this.jednotky != null) {
                this.desiatky.zobraz(this.hodnota / 10);
                this.jednotky.zobraz(this.hodnota % 10);
            }
        }
    }
    
    /**
     * Vrati hodnotu ciselneho displeja vo forme retazca, pricom hodnota je
     * vzdy vo forme dvojciferneho cisla s pripadnou uvodnou nulou.
     */
    public String getHodnotaAkoRetazec() {
        if (this.hodnota < 10) {
            return "0" + this.hodnota;
        } else {
            return "" + this.hodnota;
        }
    }
    
    /**
     * Zvacsi hodnotu na ciselnom displeji o hodnotu jedna. Ak dosiahne hornu
     * hranicu, pokracuje znovu od nuly.
     */
    public void krok() {
        this.hodnota = (this.hodnota + 1) % this.hornaHranica;
        
        if (this.desiatky != null && this.jednotky != null) {
            this.desiatky.zobraz(this.hodnota / 10);
            this.jednotky.zobraz(this.hodnota % 10);
        }
    }

    public void krokspat() {
        this.hodnota--;
        if(this.hodnota == -1) this.hodnota = hornaHranica - 1;

        if (this.desiatky != null && this.jednotky != null) {
            this.desiatky.zobraz(this.hodnota / 10);
            this.jednotky.zobraz(this.hodnota % 10);
        }
    }
}
