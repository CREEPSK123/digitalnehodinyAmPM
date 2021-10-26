
public class SegmentovaCislica {
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;

    public SegmentovaCislica(int x,int y) {
        this.segmentA = new Segment(40, 10 ,10 + x , 0 + y);
        this.segmentB = new Segment(10, 40 ,50 + x , 10 + y);
        this.segmentC = new Segment(10, 40 ,50 + x , 60 + y);
        this.segmentD = new Segment(40, 10 ,10 + x , 100 + y);
        this.segmentE = new Segment(10, 40 ,0 + x , 60 + y);
        this.segmentF = new Segment(10, 40 ,0 + x , 10 + y);
        this.segmentG = new Segment(40, 10 ,10 + x , 50 + y);
    }

    public void zobraz (int n ) {

        this.skry();

        switch (n){
            case 1:
            this.segmentB.zobraz();
            this.segmentC.zobraz();

            break;

            case 2:

            this.segmentA.zobraz();
            this.segmentB.zobraz();
            this.segmentG.zobraz();
            this.segmentE.zobraz();
            this.segmentD.zobraz();

            break;
            case 3:
            
            this.segmentA.zobraz();
            this.segmentB.zobraz();
            this.segmentG.zobraz();
            this.segmentC.zobraz();
            this.segmentD.zobraz();

            break;
            case 4:
            this.segmentF.zobraz();
            this.segmentG.zobraz();
            this.segmentB.zobraz();
            this.segmentC.zobraz();

            break;

            case 5:

            this.segmentA.zobraz();
            this.segmentF.zobraz();
            this.segmentG.zobraz();
            this.segmentC.zobraz();
            this.segmentD.zobraz();

            break;

            case 6:

            this.segmentA.zobraz();
            this.segmentF.zobraz();
            this.segmentG.zobraz();
            this.segmentE.zobraz();
            this.segmentD.zobraz();
            this.segmentC.zobraz();

            break;

            case 7:

            this.segmentA.zobraz();
            this.segmentB.zobraz();
            this.segmentC.zobraz();

            break;

            case 8:

            this.segmentA.zobraz();
            this.segmentB.zobraz();
            this.segmentC.zobraz();
            this.segmentD.zobraz();
            this.segmentE.zobraz();
            this.segmentF.zobraz();
            this.segmentG.zobraz();

            break;

            case 9:

            this.segmentA.zobraz();
            this.segmentB.zobraz();
            this.segmentC.zobraz();
            this.segmentD.zobraz();
            this.segmentF.zobraz();
            this.segmentG.zobraz();

            break;

            case 0:

            this.segmentA.zobraz();
            this.segmentB.zobraz();
            this.segmentC.zobraz();
            this.segmentD.zobraz();
            this.segmentE.zobraz();
            this.segmentF.zobraz();

            break;

        }
    }

    public void skry(){
        this.segmentA.skry();
        this.segmentB.skry();
        this.segmentC.skry();
        this.segmentD.skry();
        this.segmentE.skry();
        this.segmentF.skry();
        this.segmentG.skry();

    }
}
