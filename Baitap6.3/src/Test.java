public class Test {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(5,10,15,20);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        System.out.println(movablePoint);
    }
}
