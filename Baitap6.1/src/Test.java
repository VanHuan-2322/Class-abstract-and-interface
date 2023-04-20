import java.awt.Shape;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,20,"blue",true);
        System.out.println(rectangle);
        Circle circle=new Circle(3.14, "yellow", false);
        System.out.println(circle);
        Square square=new Square(10,"green", true);
        System.out.println(square);
    }
}
