public class SkolPersoner {
    protected String namn;
    protected String skola;
    protected int ålder;

    public SkolPersoner(String namn, int ålder, String skola) {
        if (!namn.trim().isBlank() || !skola.trim().isBlank() || ålder > 0) {
            this.namn = namn;
            this.ålder = ålder;
        } else {
            throw new IllegalArgumentException("Vg ange ett giltigt namn/ålder");
        }
    }

    // Getters
    public String getNamn() {
        return namn;
    }

    public int getÅlder() {
        return ålder;
    }

    public String getSkola() {
        return skola;
    }


    // Setters

}
