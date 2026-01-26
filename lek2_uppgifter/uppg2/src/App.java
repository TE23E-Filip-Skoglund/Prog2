void main() {
    IO.println("============ WILKOMMEN ============");

    Bil bil1 = new Bil("Volvo", "245 GL", "ABC123", 1983);
    IO.println(bil1.toString());

    bil1.ökaHastighet(50);
    IO.println("Bilens hastihget är nu: " + bil1.getHastighet());

    bil1.bromsa(20);
    IO.println("Bilens hastihget är nu: " + bil1.getHastighet());

    // Detta ska ge exception
    bil1.ökaHastighet(-10);

    Bil bil2 = new Bil("", "245 GL", "ABC123", 1983);
}