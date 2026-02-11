public class Elever extends SkolPersoner {
    protected int årskurs;

    public Elever(String namn, int ålder, int årskurs, String skola) {
        super(namn, ålder, skola);

        if (årskurs > 0 && årskurs < 10) {
            this.årskurs = årskurs;
        } else {
            throw new IllegalArgumentException("Vg ange en giltig årskurs (1-9)");
        }
    }

    // Getters
    public int getÅrskurs() {
        return årskurs;
    }


    // Setters

}
