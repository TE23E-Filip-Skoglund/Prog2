public class Vagfordon {

    protected String regnr;
    protected String ägare;
    protected String färg;
    protected int vikt;

    public Vagfordon(String regnr, String ägare, String färg, int vikt) {
        this.regnr = regnr;
        this.ägare = ägare;
        this.färg = färg;
        this.vikt = vikt;
    }

    // Getters
    public String getRegnr() {
        return regnr;
    }

    public String getÄgare() {
        return ägare;
    }

    public String getFärg() {
        return färg;
    }

    public int getVikt() {
        return vikt;
    }

    // Setters
    public void setRegnr(String regnr) {
        if (regnr.matches("[A-Za-z]{3}+[0-9]{3}+")) {
            this.regnr = regnr;
        } else {
            throw new IllegalArgumentException("Regnr måste matcha: ABC 123");
        }
    }

    public void setÄgare(String ägare) {
        this.ägare = ägare;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    // Other
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("\n");

        sb.append("Regnr: ").append(regnr);
        sb.append(" | Ägare: ").append(ägare);
        sb.append(" | Vikt: ").append(vikt);
        sb.append(" | Färg").append(färg);
        return sb.toString();
    }

}
