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

    public void setModell(String modell) {
        if (modell != null || !modell.isBlank()) {
            this.modell = modell;
        } else {
            throw new IllegalArgumentException("ERROR: Vg ange ett giltigt modellnamn (string");
        }
    }

    public void setMärke(String märke) {
        if (modell != null || !märke.isBlank()) {
            this.märke = märke;
        } else {
            throw new IllegalArgumentException("ERROR: Vg ange ett giltigt modellnamn (string");
        }
    }

    // INGEN SETT för reg_nr, denna identifierar bilen

    public void setÅrsmodell(int årsmodell) {
        if (årsmodell > 1860 || årsmodell <= Year.now().getValue()) {
            this.årsmodell = årsmodell;
        } else {
            throw new IllegalArgumentException("ERROR: Vg ange ett giltigt modellnamn (string)");
        }
    }

    public void setHastighet(int hastighet) {
        if (hastighet > 0 || hastighet < 800) {
            this.hastighet = hastighet;
        } else {
            throw new IllegalArgumentException("ERROR: Vg ange ett giltigt modellnamn (string)");
        }
    }

    public void ökaHastighet(int ökning) {
        if (ökning >= 0) {
            hastighet += ökning;
        } else {
            throw new IllegalArgumentException("ERROR: Vg ange en giltig hastighetsökning (positiv int)");
        }
    }

    public void bromsa(int minskning) {
        if (minskning >= 0 || minskning < hastighet) {
            hastighet -= minskning;
        } else {
            throw new IllegalArgumentException("ERROR: Vg ange en positiv giltig inbromsning som är mindre än nuvarande hastighet: " + hastighet);
        }
    }
}
