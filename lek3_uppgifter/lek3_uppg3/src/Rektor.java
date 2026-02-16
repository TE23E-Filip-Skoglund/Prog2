public class Rektor extends SkolPersoner {
    protected String befogan;

    public Rektor(String namn, int ålder, String skola, String befogan) {
        super(namn, ålder, skola);

        if (!befogan.isBlank()) {
            this.befogan = befogan;
        } else {
            throw new IllegalArgumentException("Vg ange en giltig befogan");
        }
    }

   // Getters
    public String getBefogan() {
        return befogan;
    }


    // Setters

}
