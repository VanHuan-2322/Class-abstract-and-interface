public class MovableCircle extends MovablePoint implements Movable {
    private  int radius;
    private  MovablePoint center;
    MovableCircle( int x, int y, int xSpeed, int ySpeed,int radius){
        super(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return super.toString()+ " radius= "+radius;
    }

    @Override
    public void MoveUp() {

    }

    @Override
    public void MoveDown() {

    }

    @Override
    public void MoveRight() {

    }

    @Override
    public void MoveLeft() {

    }
}
