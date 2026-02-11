public class Rektorer extends SkolPersoner {
    protected String befogan;

    public Rektorer(String namn, int ålder, String skola, String befogan) {
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
