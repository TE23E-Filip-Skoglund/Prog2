public class Hund extends Djur {

    public Hund() {
        super(5, 2000);
    }

    @Override
    public String läte() {
        return "Voff";
    }

    public void spåra(String bytesDjur) {
        IO.println("spårar " + bytesDjur);
    }
}
