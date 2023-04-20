package animal;/*Tạo lớp cat đucọe kế thừa từ lớp động vật và interface từ lớp Edible*/

import edible.Edible;

public class Cat extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cat: meow meow!";
    }

    @Override
    public String howToEat() {
        return "mouth";
    }
}