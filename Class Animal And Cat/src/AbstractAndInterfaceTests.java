import animal.Animal;
import animal.Cat;
import edible.Edible;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[1];
        animals[0] = new Cat();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Cat) {
                edible.Edible ediblers = (Edible) animal;
                System.out.println(ediblers.howToEat());
            }
        }
    }
}
