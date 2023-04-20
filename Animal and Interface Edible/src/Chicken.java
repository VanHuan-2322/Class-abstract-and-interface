public class Chicken extends Animal{//tạo lớp con Chicken kế thừa từ lớp trừu tượng Animal
    @Override
    public String makeSound(){
        return "Gà kêu: Ò ó o o...";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
