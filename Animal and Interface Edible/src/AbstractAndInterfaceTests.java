public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        System.out.println(animals[0].makeSound());

        System.out.println(animals[1].makeSound());

        Edible ediblers = (Edible) animals[1];
        System.out.println(ediblers.howToEat());
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }



    }
}
