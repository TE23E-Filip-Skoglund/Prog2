public class Vattenfordon extends Fordon{
    private int vikt;

    public Vattenfordon(String regnr, String tillverkare, String modell, int år, int vikt) {
        super(regnr, tillverkare, modell, år);

        this.vikt = vikt;
    }

    // Getters
    public int getVikt() {
        return vikt;
    }
    
    // Setters
    public void setVikt(int vikt) {
        this.vikt = vikt;
    }
}
