void main() {
    ArrayList<Vagfordon> fordon = new ArrayList<Vagfordon>();

    while (true) {
        String choice = meny();
        switch (choice) {
            case "1":

                break;
            case "2":
                break;

            case "3":

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
            return choice;
        } else {
            continue;
        }
    }
}