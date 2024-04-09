import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList = new ArrayList<Pet>();

    public static void main(String[] args) {
        // test LoudDog.speak()
        Kennel chineseRestaurant = new Kennel();
        LoudDog ScoobyDoo = chineseRestaurant.new LoudDog("Scooby-Doo");
        System.out.println(ScoobyDoo.speak());

        // test Kennel.allSpeak()
        chineseRestaurant.petList.add(chineseRestaurant.new Dog("Snoopy"));
        chineseRestaurant.petList.add(chineseRestaurant.new Cat("Garfield"));
        chineseRestaurant.petList.add(ScoobyDoo);
        chineseRestaurant.allSpeak();
    }

    public abstract class Pet {
        private String myName;

        public Pet(String name) {
            myName = name;
        }

        public String getName() {
            return myName;
        }

        public abstract String speak();
    }

    public class Dog extends Pet {
        public Dog(String name) {
            super(name);
        }

        public String speak() {
            return "woof";
        }
    }

    public class Cat extends Pet {
        public Cat(String name) {
            super(name);
        }

        public String speak() {
            return "meow";
        }
    }

    public class LoudDog extends Dog {
        public LoudDog(String name) {
            super(name);
        }

        public String speak() {
            String dogSound = super.speak();
            String loudDogSound = dogSound + " " + dogSound;
            return loudDogSound;
        }
    }

    public void allSpeak() {
        for (int i = 0; i < petList.size(); i++) {
            System.out.println(petList.get(i).getName() + " " + petList.get(i).speak());
        }
    }
}
