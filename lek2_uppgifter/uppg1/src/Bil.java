import java.time.Year;

public class Bil {

    private String märke;
    private String modell;
    private String reg_nr;
    private int årsmodell;
    private int hastighet;

    public Bil(String märke, String modell, String reg_nr, int årsmodell) {
        if (märke == null || märke.isBlank() ||
                modell == null || modell.isBlank() ||
                reg_nr == null || reg_nr.isBlank() ||
                årsmodell < 1860 || årsmodell > Year.now().getValue()) {
            throw new IllegalArgumentException("Das Auto ist invalide... bättre lycka nästa gång");
        }

        this.märke = märke;
        this.modell = modell;
        this.reg_nr = reg_nr;
        this.årsmodell = årsmodell;
        hastighet = 0;

    }

    public int getHastighet() {
        return hastighet;
    }

    public String getModell() {
        return modell;
    }

    public String getMärke() {
        return märke;
    }

    public String getReg_nr() {
        return reg_nr;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }


}
