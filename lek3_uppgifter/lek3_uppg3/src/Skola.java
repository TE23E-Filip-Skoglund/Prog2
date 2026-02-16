public class Skola {

    protected String skolNamn;
    protected String adress;
    protected Rektor rektor;

    public Skola(String skolNamn, String adress, Rektor rektor) {
        if (!skolNamn.isBlank() || !adress.isBlank() || rektor != null) {
            this.skolNamn = skolNamn;
            this.adress = adress;
            this.rektor = rektor;
        } else {
            throw new IllegalArgumentException("Vg ange ett giltigt namn/adress/rektor");
        }
    }

    public String getSkolNamn() {
        return skolNamn;
    }

    public void setSkolNamn(String skolNamn) {
        this.skolNamn = skolNamn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Rektor getRektor() {
        return rektor;
    }

    public void setRektor(Rektor rektor) {
        this.rektor = rektor;
    }

}
