import java.util.ArrayList;
import java.util.List;

void main() {
    /* Skapar lager och lägger till alla listor */
    List<Vara> lager = new ArrayList<>();

    lager.add(new Vara("Kaffe", 25, 5));
    lager.add(new Vara("Bulle", 20, 5));
    lager.add(new Vara("Läsk", 15, 3));
    lager.add(new Vara("Glass", 10, 3));
    lager.add(new Vara("Godispåsar", 10, 3));

    /* Programloop */
    while (true) {
        Vara vald = väljVara(lager);

        if (vald.getAntal() >= 1) {
            vald.sälj();
            IO.println("SÅLD!!! Vinst: " + vald.getPris() * 0.5);
            IO.println("Nytt saldo för " + vald.getNamn() + ": " + vald.getAntal());
        } else if (vald.getAntal() < 1) {
            IO.println("Varan är slut i lager, vill du köpa in? (ja/nej)");
            if (IO.readln().toLowerCase().trim().matches("ja")) {
                String antalString = IO.readln("Ange hur många? (1-5)");
                int antal = 0;
                try {
                    antal = Integer.parseInt(antalString);

                } catch (Exception e) {
                    IO.println(e);
                }
                if (antal != 0) {
                    vald.köp_in(antal);
                }

            }
        }
    }
}

static Vara väljVara(List<Vara> lager) {
    while (true) {
        String varonamn = IO.readln("\nANGE SÅLD VARA (tom för avslut): ");
        if (varonamn.isBlank()) {
            IO.println("Avslutar...");
            System.exit(0);
        }
        for (Vara vara : lager) {
            if (vara.getNamn().toLowerCase().matches(varonamn)) {
                return vara;
            }
        }
        IO.println("Varan fanns inte, vg försök igen");
    }
}