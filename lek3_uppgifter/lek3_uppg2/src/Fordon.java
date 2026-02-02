public class Fordon {

    protected String regnr;
    protected String tillverkare;
    protected String modell;
    protected int år;

    // Konstruktör
    public Fordon(String regnr, String tillverkare, String modell, int år) {
        this.regnr = regnr;
        this.tillverkare = tillverkare;
        this.modell = modell;
        this.år = år;
    }

    // Getters
    public String getRegnr() {
        return regnr;
    }

    public String getModell() {
        return modell;
    }

    public String getTillverkare() {
        return tillverkare;
    }

    public int getÅr() {
        return år;
    }

    // Setters
    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setTillverkare(String tillverkare) {
        this.tillverkare = tillverkare;
    }

    public void setÅr(int år) {
        this.år = år;
    }
}
