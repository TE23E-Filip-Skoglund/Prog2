public class Hund extends Djur implements Dressering {

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

    @Override
    public void apport() {
        IO.println("Apport!");
    }

    @Override
    public void kom() {
        IO.println("Komsi komsi!");
    }

    @Override
    public void sitt() {
    IO.println("Sitt!");

    }

}
