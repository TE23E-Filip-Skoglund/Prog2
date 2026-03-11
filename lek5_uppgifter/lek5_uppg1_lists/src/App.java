import java.util.ArrayList;
import java.util.List;

void main() {
    List<Person> register = new ArrayList<>();

    // 1. Lägg till person
    register.add(new Person("Anna", 1990));
    register.add(new Person("Berit", 1955));
    register.add(new Person("Carl", 2005));
    register.add(new Person("David", 1982));

    while (true) {
        String val = meny();
        switch (val) {
            case "1":
                add(register);
                break;
            case "2":
                sok(register);
                break;
            case "3":
                remove(register);
                break;
            case "4":
                System.exit(0);
                break;
        }
    }

}

static void printList(List<Person> register) {
    for (Person person : register) {
        IO.println(person.toString());
    }
}

static String meny() {
    while (true) {
        IO.println("""
                1. Lägg till
                2. Sök
                3. Ta bort
                4. Avslut
                """);
        String val = IO.readln("Välj ett av alternativen: ");
        if (List.of("1", "2", "3", "4").contains(val)) {
            return val;
        } else {
            IO.println("Fel inmatning, vg försök igen");
        }
    }

}

static void add(List<Person> register) {
    String namn = IO.readln("\n\n\nVilket namn: ");
    int fodelsedatum = Integer.parseInt(IO.readln("Ange födelseålder: "));
    register.add(new Person(namn, fodelsedatum));
}

static void sok(List<Person> register) {
    String namn = IO.readln("\n\n\nSök på namn: ");
    boolean found = false;
    for (Person person : register) {
        if (person.getNamn().toLowerCase().matches(namn.toLowerCase().trim())) {
            IO.println("\n\nResultat: " + person.toString() + "\n\n");
            found = true;
        }

    }

    if (!found) {
        IO.println("Ingen person med det namnet hittades.");
    }
}

static void remove(List<Person> register) {
    IO.println("\n\n\nTa bort ett namn ur listan");
    String namn = IO.readln("Ange ett namn: ");
    if (register.removeIf(person -> person.getNamn().equalsIgnoreCase(namn.trim()))) {
        IO.println(namn + " borttagen!");
    } else {
        IO.println("Ingen person hittad");
    }
    ;
}
