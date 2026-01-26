void main() {
    IO.println("============ WILKOMMEN ============");

    BilRegister register = new BilRegister();

    // Lägg till bilar
    register.läggTillBil(new Bil("Volvo", "XC90", "ABC123", 2019));
    register.läggTillBil(new Bil("Saab", "9-5", "XYZ789", 2010));
    register.läggTillBil(new Bil("Tesla", "Modell Y", "DEF456", 2023));

    // Visa alla bilar
    System.out.println("Alla bilar i registret:");
    System.out.println(register.toString());

    // Ta bort en bil
    register.taBortBil("XYZ789");
    System.out.println("\nEfter att ha tagit bort en bil:");
    System.out.println(register.toString());

    // Försök lägga till en bil med samma regnummer (ska kasta exception)
    try {
        register.läggTillBil(new Bil("ABC123", "BMW", "M3", 1989));
    } catch (IllegalArgumentException e) {
        System.out.println("\nFel: " + e.getMessage());
    }
}