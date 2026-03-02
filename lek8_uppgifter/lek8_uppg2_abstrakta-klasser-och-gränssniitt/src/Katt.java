public class Katt extends Djur {
    public Katt() {
        super(3, 3000);
    }

    @Override
    public String läte() {
        return "Miiuuaaaoo";
    }

    public void leka(String sak) {
        IO.println("leker med " + sak);
    }
}
