public class Tiger extends Animal {//tạo lớp con Tiger kế thừa từ lớp trừu tượng Animal
    @Override
    public String  makeSound(){
        return " Hổ gầm: Gừ gừm gừm....";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
