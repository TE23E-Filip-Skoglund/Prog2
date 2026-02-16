public class SkolKlasser {

    protected String klassNamn;
    protected Elever elever;

    public SkolKlasser(String klassNamn, Elever elever) {
        this.klassNamn = klassNamn;
        this.elever = elever;
    }

    public String getKlassNamn() {
        return klassNamn;
    }
    public void setKlassNamn(String klassNamn) {
        this.klassNamn = klassNamn;
    }

    public Elever getElever() {
        return elever;
    }
    public void setElever(Elever elever) {
        this.elever = elever;
    }

}
