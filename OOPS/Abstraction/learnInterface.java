package OOPS.Abstraction;

public class learnInterface {

    public static void main(String[] args) {

        Monkey m1 = new Monkey();

        m1.eats();
        m1.sings();
        m1.drinks();

        System.out.println(Animal.LEGS);
        m1.walk();

    }

}

interface Pet {

    void sings();

    void drinks();
}

interface Animal {

    // public static final int LEGS = 4; (SAME SAME)
   int LEGS = 4;

    void eats();

    void drinks();

    default void walk(){
        System.out.println("Animal is Walking");
    };

}

class Monkey implements Animal, Pet {

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is Singing");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }

}