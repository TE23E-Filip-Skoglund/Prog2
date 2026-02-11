void main() {
    ArrayList<Vagfordon> fordonsLista = new ArrayList<Vagfordon>();

    while (true) {
        String choice = meny();
        switch (choice) {
            case "1":
                skapaBil(fordonsLista);
                break;
            case "2":
                skapaLastbil(fordonsLista);
                break;
            case "3":
                listaFordon(fordonsLista);
                break;
            case "4":
                IO.println("Avslutar programm...");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("Måste ange 1-4");
        }
    }

}

String meny() {

    while (true) {
        IO.println("""
                ============= Meny =============
                1. Skapa Bil
                2. Skapa Lastbil
                3. Lista skapade VägFordon
                4. Avsluta program
                            """);
        IO.print("\nVälj ett alternativ: ");
        String choice = IO.readln();

        if (!choice.isBlank() && choice.matches("1|2|3|4")) {
            return choice.trim();
        } else {
            continue;
        }
    }
}

void skapaBil(ArrayList<Vagfordon> fordonsLista) {
    String regnr = inputString("Ange regnr: ", "[A-Za-z]{3}+[0-9]{3}+");
    String ägare = inputString("Ange ägare: ", null);
    String färg = inputString("Ange färg: ", null);
    int vikt = inputInt("Ange vikt: ");
    int sittPlatser = inputInt("Ange sittPlatser: ");

    Bil bil = new Bil(regnr, ägare, färg, vikt, sittPlatser);
    fordonsLista.add(bil);

    väntaPåTryck();
}

void skapaLastbil(ArrayList<Vagfordon> fordonsLista) {
    String regnr = inputString("Ange regnr: ", "[A-Za-z]{3}+[0-9]{3}+");
    String ägare = inputString("Ange ägare: ", null);
    String färg = inputString("Ange färg: ", null);
    int vikt = inputInt("Ange vikt: ");
    int lastkapacitet = inputInt("Ange lastkapacitet: ");

    Lastbil lastbil = new Lastbil(regnr, ägare, färg, vikt, lastkapacitet);
    fordonsLista.add(lastbil);

    väntaPåTryck();
}

void listaFordon(ArrayList<Vagfordon> fordonsLista) {
    IO.println("\n\n\n\n\n=============== Lista över alla fordon ===============");
    IO.println(fordonsLista.toString());

    väntaPåTryck();
}

String inputString(String msg, String regex) {

    while (true) {
        IO.print(msg);
        String input = IO.readln();

        if (!input.isBlank()) {
            if (regex == null || input.matches(regex)) {
                return input;
            } else {
                IO.println("Fel format, följ standard formatet");
            }
        } else {
            IO.println("Fel format, vg ange en String");
        }
    }
}

int inputInt(String msg) {
    while (true) {
        IO.print(msg);
        String input = IO.readln();

        try {
            int inputInt = Integer.parseInt(input.trim());
            return inputInt;
        } catch (Error e) {
            throw new IllegalArgumentException("vg ange ett heltal");
        }
    }
}

void väntaPåTryck() {
    IO.println("\nTryck på Enter för att gå tillbaka till menyn...");
    IO.readln();
}