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

    IO.println(lager);


}