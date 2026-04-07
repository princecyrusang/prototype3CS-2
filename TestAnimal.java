public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal mySheep = registry.createSheep("Dolly");
        Animal myCow = registry.createCow();
        Animal myHorse = registry.createHorse();

        System.out.println("Created: " + mySheep.getType());
        mySheep.makeSound();

        System.out.println("Created: " + myCow.getType());
        myCow.makeSound();

        System.out.println("Created: " + myHorse.getType());
        myHorse.makeSound();
    }
}