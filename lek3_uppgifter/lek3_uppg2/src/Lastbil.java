public class Lastbil extends Vagfordon {

    private int lastkapacitet;

    public Lastbil(String regnr, String ägare, String färg, int vikt, int lastkapacitet) {
        super(regnr, ägare, färg, vikt);

        this.lastkapacitet = lastkapacitet;
    }

    // Getters
    public int getLastkapacitet() {
        return lastkapacitet;
    }

    // Setters
    public void setLastkapacitet(int lastkapacitet) {
        this.lastkapacitet = lastkapacitet;
    }

    // Other
    @Override
    public String toString() {
        return super.toString() + " | Lastkapacitet: " + lastkapacitet;
    }
}
