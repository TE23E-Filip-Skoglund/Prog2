import java.util.ArrayList;
import java.util.List;

void main() {
    List<Person> register = new ArrayList<>();

    // 1. Lägg till person
    register.add(new Person("Anna", 1990));
    register.add(new Person("Berit", 1955));
    register.add(new Person("Carl", 2005));
    register.add(new Person("David", 1982));
}

static void printList(List<Person> register) {
    for (Person person : register) {
        IO.println(person.toString());
    }
}