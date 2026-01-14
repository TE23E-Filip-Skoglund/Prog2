import java.io.IOException;
import java.util.Random;

void main() {
    // Skapa slumptal
    Random würfel = new Random();
    int slumptal = würfel.nextInt(10) + 1;

    IO.println("Willkommen alles zu Das Ratespiel!");

    // Gissa ett tall mellan 1-10
    int gissatTal = 0;

    while (true) {
        String gissning = IO.readln("Schätze eine ganze Zahl zwischen 1-10: ");

        try {
            gissatTal = Integer.parseInt(gissning);
            break;
        } catch (Exception e) {
            IO.println("Ange ett heltal mellan 1-10");
            continue;
        }

    }

    
    IO.println("du gissade " + gissatTal);

    // Säg till om det är för högt eller för lågt (villkor)
    if (gissatTal < slumptal) {
        IO.print("Zu niedrig");
    } else if (gissatTal == slumptal) {
        IO.println("es ist richtig! super! \ndu hast einen großen schlonge");
    } else {
        IO.println("Zu hoch");
    }

    IO.println("Talet var: " + slumptal);

    // Gissa igenom

    // undantag

    // gissa 3 ggr med loop och metod
}
