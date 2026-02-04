public class Bil extends Vagfordon {

    private int sittPlatser;

    public Bil(String regnr, String ägare, String färg, int vikt, int sittPlatser) {
        super(regnr, ägare, färg, vikt);

        this.sittPlatser = sittPlatser;
    }

    // Getters
    public int getSittPlattser() {
        return sittPlatser;
    }

    // Setters
    public void setSittPlattser(int sittPlatser) {
        this.sittPlatser = sittPlatser;
    }

    // Other
    @Override
    public String toString() {
        return super.toString() + " | Sittplatser: " + sittPlatser;
    }

}
