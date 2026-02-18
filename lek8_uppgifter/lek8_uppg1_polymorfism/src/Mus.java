public class Mus extends Djur {
    public Mus() {
        super(1, 5000);
    }

    @Override
    public String läte() {
        return "Piiiip";
    }

    public void klättra() {
        IO.println("Musen klättrar");        
    }
}
