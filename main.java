class Fruit {
    protected int count;

    public Fruit() {
        count = 0;
    }

    public void addFruit(int quantity) {
        count += quantity;
    }

    public int getCount() {
        return count;
    }
}

class Mango extends Fruit {
    public Mango() {
        super();
    }

    // Additional methods specific to Mango, if any
}

class Apple extends Fruit {
    public Apple() {
        super();
    }

    // Additional methods specific to Apple, if any
}

public class Main {
    public static void main(String[] args) {
        Mango mango = new Mango();
        Apple apple = new Apple();

        // Adding fruits to the basket
        mango.addFruit(5); // Adding 5 mangoes
        apple.addFruit(3); // Adding 3 apples

        // Printing the counts
        System.out.println("Number of mangoes: " + mango.getCount());
        System.out.println("Number of apples: " + apple.getCount());

        int totalFruits = mango.getCount() + apple.getCount();
        System.out.println("Total number of fruits in the basket: " + totalFruits);
    }
}
