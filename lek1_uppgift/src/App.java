void main() {
    IO.println("Willkommen bis die Kalkulator-appf\n");
    Meny();
}

void Meny() {

    int[] numbers;

    while (true) {
        IO.println("""
                Meny:
                1. Addition
                2. Subbtraktion
                3. Multiplikation
                4. Division
                5. Avsluta
                """);
        String input = IO.readln("Ange val:");

        ClearConsole();
        switch (input) {
            case "1":
                numbers = UserInput();
                IO.println(numbers[0] + " + " + numbers[1] + " = " + Addition(numbers[0], numbers[1]));
                break;
            case "2":
                numbers = UserInput();
                IO.println(numbers[0] + " - " + numbers[1] + " = " + Subbtraktion(numbers[0], numbers[1]));
                break;
            case "3":
                numbers = UserInput();
                IO.println(numbers[0] + " * " + numbers[1] + " = " + Multiplikation(numbers[0], numbers[1]));
                break;
            case "4":
                numbers = UserInput();
                if (numbers[1] != 0) {
                    IO.println(numbers[0] + "/" + numbers[1] + " = " + Division(numbers[0], numbers[1]));
                } else {
                    IO.println("ILLEGAL: Kan ej dividera med 0");
                }
                break;
            case "5":
                IO.println("Avslutar programm...");
                System.exit(0);
                break;
            default:
                IO.println("Felaktigt val \nAnge ett giltigt val från menyn");
                break;
        }
        WaitforInput();
    }
}

int[] UserInput() {
    int erste = InputNumber("Erste");
    int zweite = InputNumber("Zweite");

    return new int[] { erste, zweite };
}

int InputNumber(String ordning) {
    while (true) {
        String input = IO.readln(ordning + " talet: ");
        int talet;

        try {
            talet = Integer.parseInt(input);
            return talet;
        } catch (Exception e) {
            IO.println("Felaktig inmatning, vg ange ett heltal");
        }
    }
}

double Addition(int a, int b) {
    return a + b;
}

double Subbtraktion(int a, int b) {
    return a - b;
}

double Multiplikation(int a, int b) {
    return a * b;
}

double Division(int a, int b) {
    return a / b;
}

void ClearConsole() {
    IO.println("\n".repeat(50));
}

void WaitforInput() {
    IO.println("\nTryck på enter för att fortsätta");
    IO.readln();
    ClearConsole();
}