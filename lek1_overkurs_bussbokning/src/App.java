void main() {

}

void meny() {

    while (true) {
        IO.println("""
                \n1. Lägga till en passagerare - boka en obokad plats
                2. Skriv ut hur många lediga platser det finns
                3. Beräkna vinsten av antalet sålda biljetter (299.90 kr/st).
                4. Avsluta programmet
                """);
        IO.print("Välj ett alternativ: ");

        String choice = IO.readln();

        try {
            switch (choice.trim()) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;

                default:
                    IO.println("ERROR: Vg välj ett giltigt alternativ (1-4)");
                    break;
            }
        } catch (Exception e) {
            IO.println("ERROR: Vg välj ett giltigt alternativ (1-4)");
        }

    }
}

void bookPlace() {

    
}



