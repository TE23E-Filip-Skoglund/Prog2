public class Bil extends Vagfordon {

    private int sittPlattser;

    public Bil(String regnr, String ägare, String färg, int vikt, int sittPlattser) {
        super(regnr, ägare, färg, vikt);

        this.sittPlattser = sittPlattser;
    }

    // Getters
    public int getSittPlattser() {
        return sittPlattser;
    }

    // Setters
    public void setSittPlattser(int sittPlattser) {
        this.sittPlattser = sittPlattser;
    }

}
