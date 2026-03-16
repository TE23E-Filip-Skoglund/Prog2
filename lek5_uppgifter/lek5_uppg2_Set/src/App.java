import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;

void main() {

    /* Läs in alla listor + ta bort dubletter :D */
    HashSet<String> eposter = LäsInFil("vips.txt");
    HashSet<String> vips = LäsInFil("vips.txt");
    HashSet<String> bannade = LäsInFil("bannlysta.txt");
    HashSet<String> volontärer = LäsInFil("volontärer.txt");

    // Hitta de som är både VIP & Volontärer
    HashSet<String> superVolontärer = volontärer;
    superVolontärer.retainAll(vips);

    // En lista med både VIPS och voluntärer
    HashSet<String> VolonOVips = volontärer;
    VolonOVips.addAll(vips);

    /* Program-loop */
    while (true) {
        String val = Menu();

        switch (val) {
            case "1":
                String read_epost = IO.readln("Ange epost att söka efter: ");
                Sök(bannade, read_epost);
                break;
            case "2":
                IO.println("\nPersoner som ska ha specialbadge: " + superVolontärer);
                Vänta();
                break;
            case "3":
                IO.println("\nLista på VIPs och voluntärer : " + VolonOVips);
                Vänta();
                break;
            case "4":
                IO.println("Avslutar...");
                System.exit(0);
            default:
                break;
        }
    }

}

// Menu
static String Menu() {
    IO.println("""
            \n\n====================================
            1. Kontroll bannlysta
            2. Lista på specialbadges
            3. Lista på de som både är VIPs och voluntärer
            4. Avsluta

            """);

    while (true) {
        String val = IO.readln("Ange val: ");

        if (val.matches("1|2|3|4")) {
            return val;
        } else {
            IO.println("Felaktig inmanting, vg ange ett val från menyn");
        }
    }
}

// Sök metod
static void Sök(HashSet<String> set, String epost) {

    if (set.contains(epost)) {
        IO.println("Listan inehåller eposten!!");
        Vänta();
    } else {
        IO.println("Listan inehåller inte eposten!!");
        Vänta();
    }
}

// Skapa HashSet
static HashSet<String> LäsInFil(String fil) {
    String[] temp_arr = null;
    try {
        temp_arr = Files.readString(Path.of(fil)).split(System.lineSeparator());
    } catch (Exception e) {
        IO.println("Fel på fil, meddelande: " + e.getMessage());
    }
    return new HashSet<String>(Arrays.asList(temp_arr));
}

// Vänta på input
static void Vänta() {
    IO.println("\nTryck på enter för att fortsätta");
    IO.readln();
    IO.println("\n".repeat(50));
}