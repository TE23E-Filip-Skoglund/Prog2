public class Vagfordon extends Fordon {

    private String miljoKlass;
    private String typ;

    public Vagfordon(String regnr, String tillverkare, String modell, int år, String miljoKlass, String typ) {
        super(regnr, tillverkare, modell, år);

        this.miljoKlass = miljoKlass;
        this.typ = typ;
    }

    // Getters
    public String getMiljoKlass() {
        return miljoKlass;
    }

    public String getTyp() {
        return typ;
    }

    // Setters
    public void setMiljoKlass(String miljoKlass) {
        this.miljoKlass = miljoKlass;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

}
