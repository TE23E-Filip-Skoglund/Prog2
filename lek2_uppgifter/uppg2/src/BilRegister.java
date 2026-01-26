import java.util.ArrayList;

public class BilRegister {

    private ArrayList<Bil> bilLista;

    public BilRegister() {
        this.bilLista = new ArrayList<Bil>();
    }

    public Bil HittaBil(String regnr) {
        for (Bil bil : bilLista) {
            if (bil.getReg_nr().equals(regnr)) {
                return bil;
            }
        }
        return null;
    }

    public void läggTillBil(Bil nybil) {
        if (HittaBil(nybil.getReg_nr()) != null) {
            throw new IllegalArgumentException("En bil med samma regnr finns redan i registret");
        }
        bilLista.add(nybil);
    }

    public void taBortBil(String regnr) {
        if (HittaBil(regnr) != null) {
            bilLista.remove(HittaBil(regnr));
        } else {
            throw new IllegalArgumentException("Bilen finns inte i listan");
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nAlla bilar i listan: \n");

        for (Bil bil : bilLista) {
            sb.append(bil.toString()).append("\n");
        }
        return sb.toString();
    }
}
