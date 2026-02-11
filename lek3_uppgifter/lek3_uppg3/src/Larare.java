public class Larare extends SkolPersoner {
    protected String ämne;

    public Larare(String namn, int ålder, String skola, String ämne) {
        super(namn, ålder, skola);

        if (!ämne.isBlank()) {
            this.ämne = ämne;
        } else {
            throw new IllegalArgumentException("Vg ange en giltigt ämne");
        }
    }

    // Getters
    public String getÄmne() {
        return ämne;
    }

    // Setters

}
