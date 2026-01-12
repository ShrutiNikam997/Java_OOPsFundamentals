
class Animal {

    String AnimalType;

    void Stays() {
        System.out.println("Animal in jungle");
    }
}

class Elephant extends Animal {
    void Eat() {
        System.out.println("Elephant Eating");
    }
}

class Lion extends Animal {
    void Sleeps() {
        System.out.println("Lion is sleeping");
    }
}

public class Inheritance {
    public static void main(String args[]) {

        Elephant E = new Elephant();
        E.AnimalType = "Elephant";
        System.out.println(E.AnimalType);
        E.Stays();
        E.Eat();

        Lion L = new Lion();
        L.AnimalType = "Lion";
        System.out.println(L.AnimalType);
        L.Stays();
        L.Sleeps();
    }
}